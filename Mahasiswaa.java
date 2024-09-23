public class Mahasiswaa {
    private int nrp;
    private String nama;
    public Mahasiswaa() {
        this(0,"");
    }
    public Mahasiswaa(String nama) {
        this(0,nama);
    }
    public Mahasiswaa(int nrp, String nama) {
        this.nrp=nrp;
        this.nama=nama;
    }
}