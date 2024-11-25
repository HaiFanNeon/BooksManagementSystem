package com.example.booksmanagementsystem.test.facade;

public class HallLight implements Light{
    @Override
    public void on() {
        System.out.println("HallLight on");
    }

    @Override
    public void off() {
        System.out.println("HallLight off");
    }
}
