public class Transaction {
    private String transactionId;
    private Order order;
    private Payment payment;
    private Shipping shipping;
    private double totalAmount;
    private String status; 
    
    // Constructor
    public Transaction(String transactionId, Order order) {
        this.transactionId = transactionId;
        this.order = order;
        this.status = "PENDING";
        this.calculateTotal();
    }
    
    // Methods
    private void calculateTotal() {
        this.totalAmount = order.calculateItemsTotal();
    }
    
    public boolean processTransaction() {
        if (payment.processPayment()) {
            this.status = "COMPLETED";
            return true;
        }
        this.status = "FAILED";
        return false;
    }
    
    public String getTransactionId(){
        return transactionId;
    }
}