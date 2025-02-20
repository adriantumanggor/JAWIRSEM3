public class Truk{
    private double muatan;
    private double muatanMaks;

    public Truk(double beratmaks){
        this.muatanMaks = beratmaks;
    }

    public double getMuatan(){
        return muatan;
    }

    public double getMuatanMaks(){
        return muatanMaks;
    }

    public boolean tambahMuatan(double berat){
        if(berat + muatan <= muatanMaks){
            muatan = muatan + berat;
            return true;
        }
        return false;
    }

    public double newtsToKilo(double berat){
        return berat / 9.8;
    }

    public double kiloToNewts(double berat){
        return berat * 9.8;
    }
}