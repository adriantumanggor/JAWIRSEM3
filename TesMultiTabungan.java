public class TesMultiTabungan {
    public static void main(String[] args) {
        // Create a MultiTabungan instance with initial balance in IDR
        MultiTabungan tabungan = new MultiTabungan(100000); // 100,000 IDR
        
        // Display initial saldo
        System.out.println("Saldo awal: " + tabungan.getSaldo() + " IDR");

        // Test deposit with different currencies
        tabungan.simpanUang(10, "USD"); // Deposit 10 USD
        System.out.println("Saldo setelah menyimpan 10 USD: " + tabungan.getSaldo() + " IDR");

        tabungan.simpanUang(5, "AUD");  // Deposit 5 AUD
        System.out.println("Saldo setelah menyimpan 5 AUD: " + tabungan.getSaldo() + " IDR");

        tabungan.simpanUang(50000, "IDR");  // Deposit 50,000 IDR
        System.out.println("Saldo setelah menyimpan 50,000 IDR: " + tabungan.getSaldo() + " IDR");

        // Test withdraw with different currencies
        boolean berhasilAmbilUSD = tabungan.ambilUang(3, "USD");   // Withdraw 3 USD
        if (berhasilAmbilUSD) {
            System.out.println("Saldo setelah mengambil 3 USD: " + tabungan.getSaldo() + " IDR");
        } else {
            System.out.println("Gagal mengambil 3 USD. Saldo tidak mencukupi.");
        }

        boolean berhasilAmbilAUD = tabungan.ambilUang(2, "AUD");   // Withdraw 2 AUD
        if (berhasilAmbilAUD) {
            System.out.println("Saldo setelah mengambil 2 AUD: " + tabungan.getSaldo() + " IDR");
        } else {
            System.out.println("Gagal mengambil 2 AUD. Saldo tidak mencukupi.");
        }

        // Test insufficient funds withdrawal
        boolean gagalAmbilBanyakUSD = tabungan.ambilUang(1000, "USD"); // Try withdrawing 1000 USD (should fail)
        if (gagalAmbilBanyakUSD) {
            System.out.println("Saldo setelah mengambil 1000 USD: " + tabungan.getSaldo() + " IDR");
        } else {
            System.out.println("Gagal mengambil 1000 USD. Saldo tidak mencukupi.");
        }

        // Test unsupported currency
        try {
            tabungan.simpanUang(100, "EUR"); // Unsupported currency EUR
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display final saldo in IDR
        System.out.println("Saldo akhir: " + tabungan.getSaldo() + " IDR");
    }
}
