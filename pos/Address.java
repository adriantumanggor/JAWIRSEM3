public class Address {
    private String province;
    private String city;
    private String street;
    private String postalCode; // Added postal code for completeness
    
    // Constructor
    public Address(String province, String city, String street, String postalCode) {
        this.province = province;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
    
    // Getters and setters
    public String getFullAddress() {
        return street + ", " + city + ", " + province + " " + postalCode;
    }
}