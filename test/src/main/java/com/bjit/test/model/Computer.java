package com.bjit.test.model;

import jakarta.annotation.PreDestroy;

public class Computer {
    private String brand;

    public Computer() {
        super();
        System.out.println("No - agr constructor (Computer class)");
    }

    public Computer(String brand) {
        super();
        this.brand = brand;
        System.out.println("All - agr constructor (Computer class)");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Computer object destroy");
    }
}
