package Inheritance.soal;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck (String color){
        super("Truck ", color);            
    }

    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }
    
    public int setCargoCapacity(){
        return cargoCapacity;
    }

    public void displayTruckInfo(){
        super.displayInfo() ;
        System.out.println("this truck can hold " + this.cargoCapacity + " ton\n");
    }

}
