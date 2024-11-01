public class UsbFlash implements StorageMedia {
    @Override
    public void store() {
        System.out.println("Storing data in USB flash drive");
    }
}