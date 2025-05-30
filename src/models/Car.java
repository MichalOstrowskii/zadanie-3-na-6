package models;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(int speed, String model, int numberOfDoors) {
        super(speed, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString()+", numberOfDoors: "+numberOfDoors;
    }
}
