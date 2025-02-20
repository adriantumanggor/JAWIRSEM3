
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Sistem sistem = new Sistem();
    
    public static void main(String[] args) {
        System.out.println("Welcome to E-commerce System Simulation!");
        
        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1 -> simulateNewCustomer();
                case 2 -> simulateNewOrder();
                case 3 -> sistem.displayProducts();
                case 4 -> checkOrderStatus();
                case 5 -> {
                    System.out.println("Thank you for using our system!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void displayMenu() {
        System.out.println("\n=== E-commerce System Menu ===");
        System.out.println("1. Register New Customer");
        System.out.println("2. Create New Order");
        System.out.println("3. View Products");
        System.out.println("4. Check Order Status");
        System.out.println("5. Exit");
        System.out.println("===========================");
    }
    
    private static void simulateNewCustomer() {
        System.out.println("\n=== Customer Registration ===");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        
        System.out.println("\n=== Delivery Address ===");
        System.out.print("Province: ");
        String province = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("Postal Code: ");
        String postalCode = scanner.nextLine();
        
        String customerId = sistem.registerCustomer(name, email, phone, province, city, street, postalCode);
        System.out.println("\nRegistration successful! Your Customer ID: " + customerId);
        System.out.println("Please save this ID for future orders.");
    }
    
    private static void simulateNewOrder() {
        System.out.println("\n=== Create New Order ===");
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        
        Customer customer = sistem.getCustomer(customerId);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }
        
        String orderId = sistem.createOrder(customerId);
        if (orderId == null) {
            System.out.println("Failed to create order!");
            return;
        }
        
        // Add products to order
        while (true) {
            sistem.displayProducts();
            System.out.print("\nEnter Product ID (0 to finish): ");
            int productId = getIntInput("");
            
            if (productId == 0) break;
            
            System.out.print("Enter Quantity: ");
            int quantity = getIntInput("");
            
            if (sistem.addToOrder(orderId, productId, quantity)) {
                System.out.println("Product added to cart!");
            }
        }
        
        // Display order details
        sistem.displayOrderDetails(orderId);
        
        // Confirm order
        System.out.print("\nProceed with order? (yes/no): ");
        if (!scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Order cancelled.");
            return;
        }
        
        // Select payment method
        sistem.displayPaymentMethods();
        System.out.print("\nEnter payment method code: ");
        String paymentMethod = scanner.nextLine().toUpperCase();
        
        if (!sistem.isValidPaymentMethod(paymentMethod)) {
            System.out.println("Invalid payment method!");
            return;
        }
        
        // Select shipping method
        sistem.displayShippingMethods();
        System.out.print("\nEnter shipping method code: ");
        String shippingMethod = scanner.nextLine().toUpperCase();
        
        if (!sistem.isValidShippingMethod(shippingMethod)) {
            System.out.println("Invalid shipping method!");
            return;
        }
        
        // Process transaction
        if (sistem.processTransaction(orderId, paymentMethod, shippingMethod)) {
            System.out.println("Thank you for your order!");
        } else {
            System.out.println("Transaction failed! Please try again.");
        }
    }
    
    private static void checkOrderStatus() {
        System.out.print("\nEnter Order ID: ");
        String orderId = scanner.nextLine();
        sistem.displayOrderDetails(orderId);
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}