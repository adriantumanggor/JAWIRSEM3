public class Printer implements Copier, Scanner {
    public void scanImage() {
        System.out.println("Scanning image...");
    }
    
    public void copyImage() {
        System.out.println("Copy image...");
    }
    
    public void printImage() {
        System.out.println("Print image...");
    }
}