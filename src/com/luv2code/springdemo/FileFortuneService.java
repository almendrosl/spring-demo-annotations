package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class FileFortuneService implements FortuneService{

    Random index = new Random();

    @Override
    public String getFortune() {
        List<String> fortunes = fortunesReader();
        return fortunes.get(index.nextInt(fortunes.size()));
    }

    private List<String> fortunesReader(){
        String fileName = "C:\\Users\\aluca\\udemy\\spring-demo-annotations\\src\\main\\resources\\fortunes.txt";

        List<String> fortunes =  new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            fortunes = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fortunes;
    }
}
