import java.util.Random;

public class BomSensor extends Bom {
    private boolean sensorGerakAktif;

    public BomSensor(int id, String lokasi) {
        super(id, lokasi);
        this.sensorGerakAktif = false;
    }

    public void aktifkanSensor() {
        this.sensorGerakAktif = true;
        System.out.println("Sensor gerak bom " + id + " di lokasi " + lokasi + " telah diaktifkan.");
    }

    public boolean deteksiGerakan() {
        Random random = new Random();
        boolean adaGerakan = random.nextBoolean();  

        if (adaGerakan) {
            System.out.println("Gerakan terdeteksi di sekitar bom " + id + " di lokasi " + lokasi);
            this.sensorGerakAktif = false;
            return true;
        } else {
            System.out.println("Tidak ada gerakan terdeteksi di sekitar bom " + id);
            return false;
        }
    }

    public void ledakkanBomSensor() {
        if (this.sensorGerakAktif) {
            if (deteksiGerakan()) {
                super.ledakan();
            } else {
                System.err.println("Tidak ada gerakan, bom tidak meledak.");
             }
        } else {
            System.out.println("Bom sensor " + id + " tidak aktif.");
        }
    }
}
