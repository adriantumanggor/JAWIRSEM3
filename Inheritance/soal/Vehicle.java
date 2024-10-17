package Inheritance.soal;

public class Vehicle {
    private String model;
    private int year;
    private String color;

    public Vehicle(String model, String color) {
        setModel(model);
        setColor(color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(1800 <= year && year <= 2025){
            this.year = year;
            System.out.println(this.model + "'s year saved\n");  
        }
        else{
            System.out.println("failed to save " + this.model + " 's year. Year must be less than 2025 and more than 1800\n");
        }
    }

    public void setColor(String color) {
        this.color = color; 
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void displayInfo() {
        System.out.println(">> vehicle info");
        System.out.println("model: "+ this.model);
        System.out.println("year: "+ this.year);
        System.out.println("color: "+ this.color+ "\n");
    }
}
