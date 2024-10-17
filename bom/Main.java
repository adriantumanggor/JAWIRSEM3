public class Main {
    public static void main(String[] args) {
        // Uji Bom biasa
        System.out.println("===== Uji Bom Biasa =====");
        Bom bom1 = new Bom(1, "Lokasi Tegal Mulyorejo Baru no 99😭");
        System.out.println("Status: " + bom1.getStatus());
        bom1.ledakan();
        bom1.aktifkan();
        System.out.println("Status: " + bom1.getStatus());
        bom1.ledakan();

        // Uji BomWaktu
        System.out.println("\n===== Uji Bom Waktu =====");
        BomWaktu bomWaktu = new BomWaktu(2, "Lokasi Mojokerto🤩", 3);
        bomWaktu.aktifkan();
        for (int i = 0; i < 4; i++) {
            bomWaktu.detik();
            if (i == 1) {
                bomWaktu.nonaktifkan();
            }
        }

        // Uji BomJarakJauh
        System.out.println("\n===== Uji Bom Jarak Jauh =====");
        BomJarakJauh bomJarakJauh = new BomJarakJauh(3, "Lokasi Bengkulu🤕", 100);
        bomJarakJauh.kontrolJarakJauh(150);
        bomJarakJauh.kontrolJarakJauh(50);
        bomJarakJauh.ledakkanBomJarakJauh();

        // Uji BomSensor
        System.out.println("\n===== Uji Bom Sensor =====");
        BomSensor bomSensor = new BomSensor(4, "Lokasi Bojong Gede😣");
        bomSensor.ledakkanBomSensor();
        bomSensor.aktifkanSensor();
        bomSensor.aktifkan();
        for (int i = 0; i < 5; i++) {
            bomSensor.ledakkanBomSensor();

        }
    }
}