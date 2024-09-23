class Shape {
    double length;
    double width;
    double height;
    double volume;

    // Constructor
    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = calculateVolume();
    }

    // Method to calculate volume
    double calculateVolume() {
        return length * width * height;
    }

    // Method to compare volume between two shapes
    double compareTo(Shape shape) {
        return Math.abs(this.volume - shape.volume);
    }

    // Method to print details
    void cetak() {
        System.out.println("Panjang x Lebar x Tinggi = " + length + " x " + width + " x " + height);
        System.out.println("Volume = " + volume);
    }
}
