package models;

public abstract class Vehicle {
    private int speed;
    private String model;

    public Vehicle() {

    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model: "+model+", speed: "+speed;
    }
}
