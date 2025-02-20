public abstract class Product {
    protected int productId;
    protected String name;
    protected int price;
    protected int stock;

    // Constructor
    public Product(int productId, String name, int price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void display();

    // Common methods for all products
    public void addStock(int quantity) {
        this.stock += quantity;
    }

    public void reduceStock(int quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
        }
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public String getName(){
        return name;
    }
}