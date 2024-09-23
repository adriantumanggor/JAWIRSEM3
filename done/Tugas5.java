import java.util.Scanner; 
public class Tugas5 { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
  
 // Meminta input dari pengguna 
 System.out.print("Masukkan string kalimat utama: "); 
 String kalimatUtama = scanner.nextLine(); 
  
 System.out.print("Masukkan kata yang diganti: "); 
 String kataDiganti = scanner.nextLine(); 
  
 System.out.print("Masukkan kata pengganti: "); 
 String kataPengganti = scanner.nextLine(); 
  
 // Mengganti kata 
 String kalimatHasil = kalimatUtama.replace(kataDiganti, kataPengganti); 
  
 // Menampilkan hasil 
 System.out.println("Kalimat utama menjadi: " + kalimatHasil); 
  
 scanner.close(); 
 } 
} 
