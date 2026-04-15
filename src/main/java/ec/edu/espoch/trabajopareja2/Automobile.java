/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.trabajopareja2;

import ec.edu.espoch.trabajopareja2.ennum.CarType;
import ec.edu.espoch.trabajopareja2.ennum.Color;
import ec.edu.espoch.trabajopareja2.ennum.FuelType;

/**
 *
 * @author HP
 */
public class Automobile {
private String brand;
private int model;
private boolean engine; 
private FuelType fuelType; 
private CarType carType;
private int numberDoors;
private int seatingCapacity;
private float maximumSpeed;
private Color color;
private float currentSpeed;

    public Automobile(String brand, int model, boolean engine, FuelType fuelType, CarType carType, int numberDoors, int seatingCapacity, float maximumSpeed, Color color, float currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberDoors = numberDoors;
        this.seatingCapacity = seatingCapacity;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

//Metodos Setter and Getter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public float getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(float maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
}
