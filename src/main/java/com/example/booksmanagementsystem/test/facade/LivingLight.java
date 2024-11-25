package com.example.booksmanagementsystem.test.facade;

public class LivingLight implements Light{
    @Override
    public void on() {
        System.out.println("LivingLight on");
    }

    @Override
    public void off() {
        System.out.println("LivingLight off");
    }
}
