package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructer: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a warm up";
    }
}
