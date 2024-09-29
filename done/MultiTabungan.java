private class MultiTabungan {
    private int saldo; 

    public MultiTabungan(int initSaldo) {
        this.saldo = initSaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah, String currency) {
        int jumlahIDR = convertToIDR(jumlah, currency);
        saldo = saldo + jumlahIDR;
    }

    public boolean ambilUang(int jumlah, String currency) {
        int jumlahIDR = convertToIDR(jumlah, currency);
        if (jumlahIDR <= saldo) {
            saldo = saldo - jumlahIDR;
            return true;
        }
        return false;
    }

    private int convertToIDR(int jumlah, String currency) {
        switch (currency) {
            case "USD":
                return jumlah * 9000;
            case "AUD":
                return jumlah * 10000;
            default:
                return jumlah;
        }
    }

    public int convertFromIDR(int jumlah, String currency) {
        switch (currency) {
            case "USD":
                return jumlah / 9000;
            case "AUD":
                return jumlah / 10000;
            default:
                return jumlah; 
        }
    }
}
