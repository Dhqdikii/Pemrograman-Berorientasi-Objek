package Pert4;
import java.util.Scanner;

public class FoodOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, quantity;
        double harga = 0;
        String makanan = "";

        System.out.print("\033[H\033[2J");
        // Daftar harga makanan menggunakan switch case
        System.out.println("Selamat Datang di Aplikasi Pemesanan Makanan");
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng - Rp. 15000");
        System.out.println("2. Mie Goreng - Rp. 12000");
        System.out.println("3. Ayam Goreng - Rp. 20000");
        System.out.println("4. Sate Ayam - Rp. 25000");
        System.out.println("Pilih menu (1-4):");
        
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                makanan = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                makanan = "Mie Goreng";
                harga = 12000;
                break;
            case 3:
                makanan = "Ayam Goreng";
                harga = 20000;
                break;
            case 4:
                makanan = "Sate Ayam";
                harga = 25000;
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return;
        }

        // Input jumlah pesanan
        System.out.println("Masukkan jumlah pesanan:");
        quantity = scanner.nextInt();

        // If-else untuk mengecek validitas input jumlah pesanan
        if (quantity <= 0) {
            System.out.println("Jumlah pesanan tidak valid.");
            return;
        }

        // Menghitung total harga
        double totalharga = harga * quantity;
        System.out.println("Anda memesan " + quantity + " porsi " + makanan);
        System.out.println("Total harga: Rp. " + totalharga);

        // Konfirmasi pesanan menggunakan while loop
        String confirmation;
        do {
            System.out.println("Apakah Anda ingin mengkonfirmasi pesanan? (yes/no)");
            confirmation = scanner.next();
        } while (!confirmation.equalsIgnoreCase("yes") && !confirmation.equalsIgnoreCase("no"));

        // If-else untuk konfirmasi pesanan
        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Pesanan Anda telah dikonfirmasi.");
        } else {
            System.out.println("Pesanan Anda dibatalkan.");
            return;
        }

        // Pengulangan pembayaran menggunakan for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Pembayaran dalam " + i + " detik...");
            try {
                Thread.sleep(1000); // jeda 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Akhir proses
        System.out.println("Pembayaran sukses. Terima kasih telah memesan!");
    }
}