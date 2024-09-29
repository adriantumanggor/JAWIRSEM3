public class MahasiswaConstructor {
    private int nrp;
    private String nama;

    public MahasiswaConstructor() {
        nrp=0;
        nama="";
    }
    
    public MahasiswaConstructor(String nama) {
        nrp=0;
        this.nama=nama;
    }
    public MahasiswaConstructor(int nrp, String nama) {
        this.nrp=nrp;
        this.nama=nama;
    }
    
    }