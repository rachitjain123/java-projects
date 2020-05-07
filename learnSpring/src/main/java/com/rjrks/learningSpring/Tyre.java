package com.rjrks.learningSpring;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public String getBrand() {
        return brand;
    }

//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    @Override
    public String toString() {
        return "It's Working";
    }


}
