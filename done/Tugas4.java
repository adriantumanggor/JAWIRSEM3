import java.util.Scanner; 
public class Tugas4 { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 // Meminta input dari pengguna 
 System.out.print("Masukkan nama pertama: "); 
 String namaPertama = scanner.nextLine(); 
  
 System.out.print("Masukkan nama kedua: "); 
 String namaKedua = scanner.nextLine(); 

 String[] bagianNamaPertama = namaPertama.split(" ", 2); 
 String firstNamePertama = bagianNamaPertama[0]; 
 String sisaNamaPertama = (bagianNamaPertama.length > 1) ?  
bagianNamaPertama[1] : ""; 
 // Memisahkan first name dan sisa nama dari nama kedua 
 String[] bagianNamaKedua = namaKedua.split(" ", 2); 
 String firstNameKedua = bagianNamaKedua[0]; 
 String sisaNamaKedua = (bagianNamaKedua.length > 1) ?  
bagianNamaKedua[1] : ""; 
 // Menukar first name dengan sisa nama 
 String namaBaruPertama = firstNamePertama + " " + sisaNamaKedua;  String namaBaruKedua = firstNameKedua + " " + sisaNamaPertama; 
 // Menampilkan hasil 
 System.out.println("Nama pertama setelah ditukar: " + namaBaruPertama);  System.out.println("Nama kedua setelah ditukar: " + namaBaruKedua); 
 scanner.close(); 
 } 
}
