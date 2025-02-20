public class Payment {
    private String paymentId;
    private String paymentMethod;  
    private double amount;
    private boolean isPaid;
    private Transaction transaction;
    
    // Constructor
    public Payment(String paymentId, String paymentMethod, double amount, Transaction transaction) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transaction = transaction;
        this.isPaid = false;
    }
    
    // Methods
    public boolean processPayment() {
        this.isPaid = true;
        return true;
    }
    
}
