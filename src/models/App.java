package models;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car(400, "Tico", 5);
        vehicles[1] = new Car(185, "Lotus", 3);
        vehicles[2] = new Plane(700, "Boeing", 8);
        vehicles[3] = new Plane(940, "Airbus", 6);
        for(int i=0;i<4;i++)
        {
            System.out.println(vehicles[i].toString());
        }
        System.out.println("Teraz foreach");
        for(Vehicle x:vehicles)
        {
            System.out.println(x.toString());
        }


    }
}
