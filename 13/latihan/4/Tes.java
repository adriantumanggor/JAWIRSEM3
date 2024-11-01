public class Tes {
    // Polymorphis Argument
    public static void pekerjaan(Pegawai pegawai){
        if (pegawai instanceof Manager) {
            Manager ifel = (Manager) pegawai;
            ifel.displayPosisi();
            ifel.iniManager();
        }
        else if(pegawai instanceof Kurir){
            pegawai.displayPosisi();
            Kurir aril = (Kurir) pegawai;
            aril.displayPosisi();
        }
        else{
            pegawai.displayPosisi();
        }
    }

    public static void main(String[] args) {
        Pegawai manajer = new Manager("ifel");
        Pegawai kurir = new Kurir("aril");
        Pegawai pegawai = new Pegawai("alex");

        pekerjaan(manajer);
        pekerjaan(kurir);
        pekerjaan(pegawai);
    }
}
