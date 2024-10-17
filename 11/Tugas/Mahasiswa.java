public class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String username, String password, String phone, String id) {
        super(username, password, phone, id);
    }
    
    public Mahasiswa(String username, String password, String phone, String id, Dosen dosenWali, String kelas) {
        super(username, password, phone, id);
        this.dosenWali = dosenWali;
        this.kelas = kelas;
    }

}
