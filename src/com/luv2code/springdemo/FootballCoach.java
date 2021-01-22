package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Kick the ball 4 time a week";
    }
}
