public class Manager extends Pegawai {
    public Manager(String name) {
        super(name);
    }

    public void displayPosisi() {
        System.out.println(name + " bekerja sebagai manager");
    }

    public void iniManager(){
        System.out.println("Aku manager");
    }
}
