public class BomWaktu extends Bom {
    private int timer;

    public BomWaktu(int id, String lokasi, int timer) {
        super(id, lokasi);
        this.timer = timer;
    }

    public void detik() {
        if (this.timer > 0) {
            this.timer--;
            System.out.println("Timer bom " + id + ": " + this.timer + " detik");
            if (this.timer == 0) {
                this.ledakkanBomWaktu();
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ledakkanBomWaktu() {
        super.ledakan();
    }
}

