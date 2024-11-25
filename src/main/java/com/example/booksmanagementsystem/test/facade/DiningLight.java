package com.example.booksmanagementsystem.test.facade;

public class DiningLight implements Light{
    @Override
    public void on() {
        System.out.println("dining light on");
    }

    @Override
    public void off() {
        System.out.println("dining light off");
    }
}
