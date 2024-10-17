public class BomJarakJauh extends Bom {
    private int jarak;

    public BomJarakJauh(int id, String lokasi, int jarak) {
        super(id, lokasi);
        this.jarak = jarak;
    }

    public void kontrolJarakJauh(int jarakSekarang) {
        if (jarakSekarang <= this.jarak) {
            System.out.println("Jarak di dalam jangkauan");
            System.out.println("Kontrol jarak jauh aktif untuk bom " + id);
            this.aktifkan();
        } else {
            System.out.println("Bom " + id + " di luar jangkauan kontrol");
        }
    }

    public void ledakkanBomJarakJauh() {
        super.ledakan();
    }
}
