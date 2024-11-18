package Pert4;

import java.util.Scanner;

// Program SWITCH untuk Lampu Lalu Lintas
public class LampuLaluLintas {

    public static void main(String[] args) {
        // Membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        // Mengambil input
        System.out.print("Inputkan Nama Warna: ");
        lampu = scan.nextLine().toLowerCase(); // Membuat input menjadi huruf kecil untuk menghindari case-sensitivity

        // Memeriksa warna lampu
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan!");
                break;
            default:
                System.out.println("Warna lampu tidak dikenal, harap masukkan merah, kuning, atau hijau.");
        }

        // Menutup scanner
        scan.close();
    }
}
