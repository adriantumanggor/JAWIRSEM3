package Inheritance.soal;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle (String color){
        super("Motorcycle ", color);            
    }

    public void setNumberOfDoors(){
        this.hasSideCar = hasSideCar;
    }
    
    public boolean getNumberOfDoors(){
        return hasSideCar;
    }

    public void displayMotorcycleInfo(){
        if(this.hasSideCar == true){
            super.displayInfo();
	        System.out.println( "this motorcycle has " + this.hasSideCar + " doors\n");
        }
	else{
        super.displayInfo();
		System.out.println( "this car doesnot have a sidecar\n");
	}

    }

}
