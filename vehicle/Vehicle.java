public class Vehicle {
    private String model;
    private int year;
    private String color;

    public Vehicle(String model, String color) {
        setModel(model);
        // setYear(year);
        setColor(color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(1800 <= year && year <= 2025){
            this.year = year;
            System.out.println(this.model + " year saved\n");  
        }
        else{
            System.out.println("failed\n");
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

    public String displayInfo() {
        String info;

        info = "Vehicle info >>\n   " +
        "Model: " + this.model + "\n" 
        + "Year: " + this.year + "\n" 
        + "Color: " + this.color + "\n" ;

        return info;
    }
}
