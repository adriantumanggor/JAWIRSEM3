package Inheritance.soal;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String color){
        super("Car", color);            
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void displayCarInfo(){
        super.displayInfo();
        System.out.println("this car has " + this.numberOfDoors + " doors\n");
    }

}
