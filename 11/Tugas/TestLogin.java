public class TestLogin {
    public static void main(String[] args) {
        Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", "083853501388", "M001");

        boolean result = fadilah.login("083853501388", "123456");
        System.out.println(result ? "Login berhasil" : "Login gagal");

        Dosen fahrul = new Dosen("fahrul", "123456", "Lektor", "IV/a", "19990129");

        result = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(result ? "Login berhasil" : "Login gagal");
    }
}
