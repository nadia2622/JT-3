
package main;

public class Vehicle {
    private String plateNumber;
    private double speed;   //Nadia Tambunan 103122400005
    private int numWheels;
    private String vehicleType;
    
public Vehicle (String plateNumber, double speed) {
    this.plateNumber = plateNumber;
    this.speed = speed;  //nomor 2
}
public Vehicle (String plateNumber, double speed, int numWheels, String vehicleType) {
    this.plateNumber = plateNumber;
    this.speed = speed;   // nomor 2
    this.numWheels = numWheels;
    this.vehicleType = vehicleType;
}

public String getPlateNumber() {
        return plateNumber;
    }
       //Nadia Tambunan 103122400005
    public double getSpeed() {
        return speed;
    }
    
    public int getNumWheels(){
        return numWheels;
    }
    public String getVehicleType () {
        return vehicleType;
    }

public double calculateTravelTime(double distance) {
    if (speed <= 0) {
        throw new IllegalArgumentException("Kecepatan harus lebih dari 0");
    }
    return distance / speed;
}

public double calculateTravelTime(double distance, double customSpeed){
    if(customSpeed <= 0) {
        throw new IllegalArgumentException("Kecepatan harus lebih dari 0");
    }
    return distance / customSpeed;  //Nadia Tambunan 103122400005
}

public void displayInfo(String plateNumber, double speed, int numWheels, String vehicleType, double customSpeed){
    System.out.println("Plate Number: " + plateNumber);
    System.out.println("Speed: " + speed);
    System.out.println("Number of wheels: " + numWheels);
    System.out.println("Vehicle Type" + vehicleType);
    System.out.println("Trevel time for 500 km:  " + calculateTravelTime(speed));
    System.out.println("Trevel time for 500 km with custom speed  " + customSpeed + "km/h: " + calculateTravelTime(speed, customSpeed)+ "\n");
}

public void displayInfo(String plateNumber, double speed, int numWheels, String vehicleType){
    System.out.println("Plate Number: " + plateNumber);
    System.out.println("Speed: " + speed);   //Nadia Tambunan 103122400005
    System.out.println("Number of wheels: " + numWheels);
    System.out.println("Vehicle Type" + vehicleType);
    System.out.println("Trevel time for 500 km:  " + calculateTravelTime(speed) + "\n");
}
}

