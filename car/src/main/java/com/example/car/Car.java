package com.example.car;


// test changement
public class Car {

    private String plateNumber;
    private String brand;
    private int price;
    private boolean rented;
    private rentedDate dates;

    public Car(String plateNumber, String brand, int price, boolean rented, rentedDate dates) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented = rented;
        this.dates = dates;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean isRented() {
        return rented;
    }

    public rentedDate getDates() {
        return dates;
    }

    // Setters
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public void setDates(rentedDate dates) {
        this.dates = dates;
    }
}


    

    