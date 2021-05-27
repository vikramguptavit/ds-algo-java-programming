package com.vikram;


class Laptop extends Machine {
    @Override
    public void start() {

        System.out.println("Laptop has started!!!");
    }

    public void stop() {
        System.out.println("Laptop has stopped!!!");
    }
}

