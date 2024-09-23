import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner ambil = new Scanner(System.in);
        OperasiString convert = new OperasiString();

        System.out.print("Masukkan string: ");
        String input = ambil.nextLine();

        System.out.println("Output: " + convert.penggantiHuruf(input));

        ambil.close();
    }
}

class OperasiString {
    public String penggantiHuruf(String asal) {
        if (asal == null || asal.isEmpty()) {
            return asal;
        }

        char awal = asal.charAt(0);
        char akhir = asal.charAt(asal.length() - 1);
        StringBuilder hasil = new StringBuilder();

        for (int a = 0; a < asal.length(); a++) {
            char periksa = asal.charAt(a);

            if (Character.toLowerCase(periksa) == Character.toLowerCase(awal)) {
                if (Character.isUpperCase(periksa)) {
                    hasil.append(Character.toUpperCase(akhir));
                } else {
                    hasil.append(Character.toLowerCase(akhir));
                }
            } else if (Character.toLowerCase(periksa) == Character.toLowerCase(akhir)) {
                if (Character.isUpperCase(periksa)) {
                    hasil.append(Character.toUpperCase(awal));
                } else {
                    hasil.append(Character.toLowerCase(awal));
                }
            } else {
                hasil.append(periksa);
            }
        }

        return hasil.toString();
    }
}
