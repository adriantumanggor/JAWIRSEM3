import java.util.Scanner;

public class Finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Masukkan karakter yang ingin dicari: ");
        char karakter = scanner.next().charAt(0);

        scanner.close();

        boolean ditemukan = false;
        System.out.print("Karakter '" + karakter + "' terdapat pada indek ");

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == karakter) {
                if (ditemukan) {
                    System.out.print(", ");
                }
                System.out.print(i);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.print("tidak ditemukan dalam kalimat.");
        }

        System.out.println();
    }
}
