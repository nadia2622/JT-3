
package main;

public class Main {

    public static void main(String[] args) {
        Vehicle truck = new Vehicle("R1234", 100, 6, "Truck");
        truck.displayInfo("R123450", 100, 90, "truck");
        truck.displayInfo("R123450", 100, 90, "truck", 90);
        
        Vehicle car = new Vehicle("AA1234", 120, 4, "Car");    //Nadia Tambunan 103122400005
        car.displayInfo("R123450", 100, 90, "car");
        car.displayInfo("R123450", 100, 90, "car", 70);
        
        Vehicle motorcycle = new Vehicle("F1234", 100, 2, "Motorcycle");
        motorcycle.displayInfo("R123450", 100, 90, "Motorcycler");
        motorcycle.displayInfo("R123450", 100, 90, "Motorcycle", 100);
        
        
    }
    
}
