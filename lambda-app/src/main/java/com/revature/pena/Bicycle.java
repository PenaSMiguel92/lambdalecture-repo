package com.revature.pena;

public class Bicycle {
    private String brand;
    private Integer frameSize;

    Bicycle() {
    }

    Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }
    public String getBrand(){
        return this.brand;
    }

    public Integer getFrameSize() {
        return this.frameSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }

    @Override
    public String toString() {
        return "\nBicycle: " + "\nBrand: " + this.brand + "\nFrameSize: " + this.frameSize;
    }

}
