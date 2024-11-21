package com.example.booksmanagementsystem.test;

public class Main {

    public static void main(String[] args) {
        Tire tire = new Tire(20);
        Bottom bottom = new Bottom(tire);
        Framework framework = new Framework(bottom);
        Car car = new Car(framework);
        car.run();
    }

    static class Car {
        private Framework framework;

        public Car (Framework framework) {
            this.framework = framework;
            System.out.println("Car init---");
        }

        public void run() {
            System.out.println("Car run---");
        }
    }

    static class Framework {
        private Bottom bottom;

        public Framework(Bottom bottom) {
            this.bottom = bottom;
            System.out.println("Framework init---");
        }
    }

    static class Bottom {
        private Tire tire;
        public Bottom(Tire tire) {
            this.tire = tire;
            System.out.println("Bottom init---");
        }
    }

    static class Tire {
        private int size;
        public Tire (int size) {
            this.size = size;
            System.out.println("轮胎尺寸 " + size);
        }
    }
}

