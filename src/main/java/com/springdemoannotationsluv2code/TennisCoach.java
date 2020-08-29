package com.springdemoannotationsluv2code;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice for backhand";
    }
}
