package com.example.booksmanagementsystem.test.facade;

public class FacadePattern {
    public void lightOn() {
        HallLight hallLight = new HallLight();
        hallLight.on();

        LivingLight livingLight = new LivingLight();
        livingLight.on();

        DiningLight diningLight = new DiningLight();
        diningLight.on();
    }

    public void lightOff() {
        HallLight hallLight = new HallLight();
        hallLight.off();

        LivingLight livingLight = new LivingLight();
        livingLight.off();

        DiningLight diningLight = new DiningLight();
        diningLight.off();
    }
}
