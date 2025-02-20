public class Electronics extends Product {
    private int imeiId;
    private int guarantee;

    public Electronics(int productId, String name, int price, int stock, int imeiId, int guarantee) {
        super(productId, name, price, stock);
        this.imeiId = imeiId;
        this.guarantee = guarantee;
    }

    @Override
    public void display() {
        System.out.println("Electronics - " + name + " (ID: " + productId + ")");
        System.out.println("Price: " + price + ", Stock: " + stock);
        System.out.println("Guarantee: " + guarantee + " months");
    }
}