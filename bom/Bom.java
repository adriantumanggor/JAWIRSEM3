// Kelas utama Bom
public class Bom {
    protected int id;
    protected String lokasi;
    protected String status;

    public Bom(int id, String lokasi) {
        this.id = id;
        this.lokasi = lokasi;
        this.status = "nonaktif";
    }

    public void aktifkan() {
        this.status = "aktif";
        System.out.println("Bom " + id + " diaktifkan.");
    }

    public void nonaktifkan() {
        this.status = "nonaktif";
        System.out.println("Bom " + id + " dinonaktifkan.");
    }

    public String getStatus() {
        return this.status;
    }

    public void ledakan() {
        if (this.status.equals("aktif")) {
            this.status = "meledak";
            try {
                Thread.sleep(1000); 
                System.out.println("DUARR Buakakakak! 💢💥");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bom " + id + " meledak di " + lokasi + "!");
        } else {
            System.out.println("Bom " + id + " tidak dapat diledakkan karena status: " + this.status + "🥳");
        }
    }

}
