public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
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
