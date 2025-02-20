public class Customer {
    private String customerId;
    private String name;
    private String email;    // Added email
    private String phone;    // Added phone
    private Address address;
    
    // Constructor
    public Customer(String customerId, String name, String email, String phone, Address address) {
        this.customerId = customerId;
        updateProfile(name, email, phone);
        updateAddress(address);
    }
    
    public boolean updateProfile(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        return true;
    }
    
    public boolean updateAddress(Address newAddress) {
        this.address = newAddress;
        return true;
    }

    public String getCustomerId(){
        return customerId;
    }

    public Address getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }
}
