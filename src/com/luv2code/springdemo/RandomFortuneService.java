package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {
            "Beware with the wolf!",
            "Diligence is the mother of luck!",
            "The journey is the reward"
    };

    private Random myRandom =  new Random();

    @Override
    public String getFortune() {
        int index =  myRandom.nextInt(data.length);
        return data[index];
    }

}
