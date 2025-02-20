public class FnB extends Product {
    private String expiredDate;
    private int calorie;

    public FnB(int productId, String name, int price, int stock, String expiredDate, int calorie) {
        super(productId, name, price, stock);
        this.expiredDate = expiredDate;
        this.calorie = calorie;
    }

    @Override
    public void display() {
        System.out.println("Food & Beverage - " + name + " (ID: " + productId + ")");
        System.out.println("Price: " + price + ", Stock: " + stock);
        System.out.println("Expires: " + expiredDate + ", Calories: " + calorie);
    }
}