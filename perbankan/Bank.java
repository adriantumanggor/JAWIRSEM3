package perbankan;

public class Bank{
    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank(){
        this.nasabah = new Nasabah[10];
        this.jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir){
        this.nasabah[jumlahNasabah++] = new Nasabah(namaAwal, namaAkhir); 
    }

    public int getJumlahNasabah()
    {
        return this.jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks){
        return this.nasabah[indeks];
    }
}