package ec.edu.espoch.trabajopareja2;

import ec.edu.espoch.trabajopareja2.ennum.CarType;
import ec.edu.espoch.trabajopareja2.ennum.Color;
import ec.edu.espoch.trabajopareja2.ennum.FuelType;

public class Automobile {
private String brand;
private int model;
private int engine; 
private FuelType fuelType; 
private CarType carType;
private int numberDoors;
private int seatingCapacity;
private int maximumSpeed;
private Color color;
private int currentSpeed;

    public Automobile(String brand, int model, int engine, FuelType fuelType, CarType carType, int numberDoors, int seatingCapacity, int maximumSpeed, Color color, int currentSpeed) {
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

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
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

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    
}
