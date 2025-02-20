// Sistem.java
import java.util.*;

public class Sistem {
    private Map<Integer, Product> products;
    private Map<String, Customer> customers;
    private Map<String, Order> orders;
    private Map<String, String> paymentMethods;
    private Map<String, String> shippingMethods;
    private int customerCounter = 1;
    private int orderCounter = 1;
    
    public Sistem() {
        initializeSystem();
    }
    
    private void initializeSystem() {
        // Initialize collections
        products = new HashMap<>();
        customers = new HashMap<>();
        orders = new HashMap<>();
        paymentMethods = new HashMap<>();
        shippingMethods = new HashMap<>();
        
        // Initialize Products
        // Electronics
        products.put(1, new Electronics(1, "MacBook Pro", 10, 10, 100001, 12));
        products.put(2, new Electronics(2, "iPhone 15", 15, 20, 100002, 12));
        products.put(3, new Electronics(3, "Samsung TV", 20, 15, 100003, 24));
        products.put(4, new Electronics(4, "AirPods Pro", 30, 30, 100004, 12));
        
        // Food & Beverages
        products.put(5, new FnB(5, "Protein Bar", 3, 100, "2024-12-31", 200));
        products.put(6, new FnB(6, "Energy Drink", 2, 150, "2024-06-30", 180));
        products.put(7, new FnB(7, "Vitamin Water", 2, 200, "2024-09-30", 100));
        products.put(8, new FnB(8, "Granola Bar", 1, 300, "2024-12-31", 150));
        
        // Initialize Payment Methods
        paymentMethods.put("CC", "Credit Card");
        paymentMethods.put("BT", "Bank Transfer");
        paymentMethods.put("PP", "PayPal");
        paymentMethods.put("COD", "Cash On Delivery");
        
        // Initialize Shipping Methods
        shippingMethods.put("STD", "Standard Shipping (3-5 days)");
        shippingMethods.put("EXP", "Express Shipping (1-2 days)");
        shippingMethods.put("ND", "Next Day Delivery");
    }
    
    // Customer Management
    public String registerCustomer(String name, String email, String phone, 
                                 String province, String city, String street, String postalCode) {
        String customerId = String.format("C%04d", customerCounter++);
        Address address = new Address(province, city, street, postalCode);
        Customer customer = new Customer(customerId, name, email, phone, address);
        customers.put(customerId, customer);
        return customerId;
    }
    
    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }
    
    // Order Management
    public String createOrder(String customerId) {
        Customer customer = customers.get(customerId);
        if (customer == null) return null;
        
        String orderId = String.format("O%04d", orderCounter++);
        Order order = new Order(orderId, customer);
        orders.put(orderId, order);
        return orderId;
    }
    
    public boolean addToOrder(String orderId, int productId, int quantity) {
        Order order = orders.get(orderId);
        Product product = products.get(productId);
        
        if (order == null || product == null) return false;
        
        if (product.getStock() < quantity) {
            System.out.println("Insufficient stock! Available: " + product.getStock());
            return false;
        }
        
        order.addItem(product, quantity);
        return true;
    }
    
    // Display Methods
    public void displayProducts() {
        System.out.println("\n=== Available Products ===");
        System.out.println("Electronics:");
        products.values().stream()
                .filter(p -> p instanceof Electronics)
                .forEach(p -> {
                    p.display();
                    System.out.println();
                });
        
        System.out.println("\nFood & Beverages:");
        products.values().stream()
                .filter(p -> p instanceof FnB)
                .forEach(p -> {
                    p.display();
                    System.out.println();
                });
    }
    
    public void displayPaymentMethods() {
        System.out.println("\n=== Payment Methods ===");
        paymentMethods.forEach((key, value) -> 
            System.out.println(key + " - " + value));
    }
    
    public void displayShippingMethods() {
        System.out.println("\n=== Shipping Methods ===");
        shippingMethods.forEach((key, value) -> 
            System.out.println(key + " - " + value));
    }
    
    public void displayOrderDetails(String orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("Order not found!");
            return;
        }
        
        System.out.println("\n=== Order Details ===");
        System.out.println("Order ID: " + order.getOrderId());
        Customer customer = order.getCustomer();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Delivery Address: " + customer.getAddress().getFullAddress());
        
        System.out.println("\nOrdered Items:");
        order.getItems().forEach(item -> {
            Product product = item.getProduct();
            System.out.printf("- %s (Qty: %d, Price: Rp%d, Subtotal: Rp%.2f)\n",
                product.getName(), item.getQuantity(), product.getPrice(), item.getSubtotal());
        });
        
        System.out.printf("\nTotal Amount: Rp%.2f\n", order.calculateItemsTotal());
    }
    
    // Transaction Processing
    public boolean processTransaction(String orderId, String paymentMethod, String shippingMethod) {
        Order order = orders.get(orderId);
        if (order == null) return false;
        
        // Create and process transaction
        Transaction transaction = new Transaction(
            String.format("T%04d", orderCounter),
            order
        );
        
        // Create payment
        Payment payment = new Payment(
            String.format("P%04d", orderCounter),
            paymentMethod,
            order.calculateItemsTotal(),
            transaction
        );
        
        // Create shipping
        Shipping shipping = new Shipping(
            String.format("S%04d", orderCounter),
            shippingMethod,
            order.getCustomer().getAddress()
        );
        
        // Process payment and shipping
        if (payment.processPayment()) {
            shipping.ship();
            
            // Update stock
            order.getItems().forEach(item -> 
                item.getProduct().reduceStock(item.getQuantity()));
            
            // Print confirmation
            System.out.println("\n=== Transaction Completed Successfully ===");
            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Shipping Tracking Number: " + shipping.getTrackingNumber());
            return true;
        }
        
        return false;
    }
    
    // Validation Methods
    public boolean isValidPaymentMethod(String method) {
        return paymentMethods.containsKey(method);
    }
    
    public boolean isValidShippingMethod(String method) {
        return shippingMethods.containsKey(method);
    }
}
