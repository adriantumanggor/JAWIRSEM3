class Operasi {
    public String ubahStringUpper(String kalimat) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < kalimat.length(); i++) {
            char ambilhuruf = kalimat.charAt(i);
            if (ambilhuruf >= 'a' && ambilhuruf <= 'z') {
                ambilhuruf = (char) (ambilhuruf - 32); // ASCII offset untuk konversi
            }
            hasil.append(ambilhuruf);
        }
        return hasil.toString();
    }

    public int panjangString(String kalimat) {
        return kalimat.length();
    }

    public static void main(String[] args) {
        OperasiString ops = new OperasiString();
        
        String kalimat = "Hello World!";
        
        String upperCaseKalimat = ops.ubahStringUpper(kalimat);
        System.out.println("String dalam huruf kapital: " + upperCaseKalimat);
        
        int panjang = ops.panjangString(kalimat);
        System.out.println("Panjang string: " + panjang);
    }
}
