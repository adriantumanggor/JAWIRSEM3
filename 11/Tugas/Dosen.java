public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
    }

    public Dosen(String username, String password, String pangkat, String golongan, String key) {
        super(username, password);
        this.pangkat = pangkat;
        this.golongan = golongan;
        this.key = key;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    public boolean login(String username, String password, String key) {
        return super.login(username, password) && this.key.equals(key);
    }
}
