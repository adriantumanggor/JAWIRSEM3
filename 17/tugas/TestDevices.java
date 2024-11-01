public class TestDevices {
    public static void main(String[] args) {
        Ballpoint ballpoint = new Ballpoint();
        Gun gun = new Gun();
        UsbFlash usbFlash = new UsbFlash();
        
        // Test ballpoint functionality
        ballpoint.draw();
        ballpoint.useLaser();
        ballpoint.store();
        
        // Test gun functionality
        gun.useLaser();
        
        // Test USB flash functionality
        usbFlash.store();
    }
}