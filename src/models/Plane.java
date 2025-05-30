package models;

public class Plane extends Vehicle{
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    public Plane(int speed, String model, int numberOfSeats) {
        super(speed, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {

        return super.toString()+", numberOfSeats: "+numberOfSeats;
    }
}
