public class Shipping {
    private String shippingId;
    private String shippingMethod;
    private boolean isShipped;
    private String trackingNumber;
    
    // Constructor
    public Shipping(String shippingId, String shippingMethod, Address deliveryAddress) {
        this.shippingId = shippingId;
        this.shippingMethod = shippingMethod;
        this.isShipped = false;
    }
    
    // Methods
    public boolean ship() {
        this.isShipped = true;
        this.generateTrackingNumber();
        return true;
    }
    
    private void generateTrackingNumber() {
        // Generate tracking number logic
        this.trackingNumber = "TRACK-" + java.lang.System.currentTimeMillis();
    }

    public String getTrackingNumber(){
        return trackingNumber;
    }
    
    public String getShippingStatus() {
        return isShipped ? "Shipped" : "Pending";
    }
}

