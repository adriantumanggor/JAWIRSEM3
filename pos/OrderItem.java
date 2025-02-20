public class OrderItem {
    private Product product;
    private int quantity;
 
    public OrderItem(Product product, int quantity) {
       if (quantity <= 0) {
          throw new IllegalArgumentException("Quantity must be positive.");
       }
       this.product = product;
       this.quantity = quantity;
    }
 
    public Product getProduct() {
        return product;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
 }
 