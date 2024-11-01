public class Ballpoint implements LaserPointer, StorageMedia {
    public void draw() {
        System.out.println("Drawing with ballpoint");
    }
    
    @Override
    public void useLaser() {
        System.out.println("Using laser pointer from ballpoint");
    }
    
    @Override
    public void store() {
        System.out.println("Storing data in ballpoint");
    }
}