    import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Soal3{

public static class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}

public static class SaleItem {
    private Product product;
    private int quantity;

    public SaleItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

public static class Transaction {
    private List<SaleItem> saleItems;

    public Transaction() {
        saleItems = new ArrayList<>();
    }

    public void addSaleItem(SaleItem item) {
        saleItems.add(item);
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;

        for (SaleItem item : saleItems) {
            totalRevenue += item.getTotalPrice();
        }
        return totalRevenue;
    }
    }

public static void main(String[] args) {
    Product laptop = new Product("Laptop", 10000000);
    Product phone = new Product("Phone", 5000000);
    Product tab = new Product("Tab", 1000000);
	
    SaleItem laptopSale = new SaleItem(laptop, 2);  
    SaleItem phoneSale = new SaleItem(phone, 1);
    SaleItem tabSale = new SaleItem(tab, 1); 

    Transaction transaction = new Transaction();

    transaction.addSaleItem(laptopSale);
    transaction.addSaleItem(phoneSale); 
    transaction.addSaleItem(tabSale);
        
    double totalRevenue = transaction.calculateTotalRevenue();

    DecimalFormat df = new DecimalFormat("#0.0");
    String formattedRevenue = df.format(totalRevenue);

    System.out.println("Total pendapatan: " + formattedRevenue);    
    }
}
