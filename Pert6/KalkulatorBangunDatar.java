package Pert6;

import java.util.Scanner;

public class KalkulatorBangunDatar {

    // Method untuk menghitung luas persegi
    public static double LuasPersegi(double sisi) {
        return Math.pow(sisi, 2);
    }

    // Method untuk menghitung luas persegi panjang
    public static double LuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung luas lingkaran
    public static double LuasLingkaran(double jariJari) {
        return Math.pow(jariJari, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bangunDatar;

        System.out.println("PROGRAM UNTUK MENGHITUNG LUAS BANGUN DATAR\n");

        System.out.print("\033[H\033[2J");
        while (true) {
            System.out.println("1. LUAS PERSEGI");
            System.out.println("2. LUAS PERSEGI PANJANG");
            System.out.println("3. LUAS LINGKARAN");
            System.out.print("MASUKKAN BANGUN DATAR YANG INGIN ANDA HITUNG LUASNYA (1/2/3) : ");
            bangunDatar = scanner.next();
            System.out.println();

            if (bangunDatar.equals("1")) {
                System.out.println("MENGHITUNG LUAS PERSEGI\n");
                System.out.print("MASUKKAN PANJANG SISI PERSEGI : ");
                double sisi = scanner.nextDouble();
                double luas = LuasPersegi(sisi);
                System.out.println("LUAS PERSEGI DENGAN PANJANG SISI " + sisi + " CM ADALAH " + luas + " CM²");

            } else if (bangunDatar.equals("2")) {
                System.out.println("MENGHITUNG LUAS PERSEGI PANJANG\n");
                System.out.print("MASUKKAN PANJANG PERSEGI : ");
                double panjang = scanner.nextDouble();
                System.out.print("MASUKKAN LEBAR PERSEGI : ");
                double lebar = scanner.nextDouble();
                double luas = LuasPersegiPanjang(panjang, lebar);
                System.out.println("LUAS PERSEGI PANJANG DENGAN PANJANG " + panjang + " CM DAN LEBAR " + lebar + " CM ADALAH " + luas + " CM²");

            } else if (bangunDatar.equals("3")) {
                System.out.println("MENGHITUNG LUAS LINGKARAN\n");
                System.out.print("MASUKKAN JARI-JARI LINGKARAN : ");
                double jariJari = scanner.nextDouble();

                double luas;
                if (jariJari % 7 == 0) {
                    luas = LuasLingkaran(jariJari) * 22 / 7;
                } else {
                    luas = LuasLingkaran(jariJari) * 3.14;
                }
                System.out.println("LUAS LINGKARAN DENGAN JARI-JARI " + jariJari + " CM ADALAH " + luas + " CM²");

            } else {
                System.out.println("MAAF, BANGUN DATAR YANG ANDA MASUKKAN TIDAK TERSEDIA\n");
                continue;
            }

            System.out.println("\n>> KETIK APA SAJA UNTUK MELANJUTKAN");
            System.out.println(">> KETIK 1 UNTUK BERHENTI");
            System.out.print("APAKAH ANDA INGIN MENGHITUNG LUAS BANGUN DATAR LAGI? : ");
            String next = scanner.next();

            if (next.equals("1")) {
                break;
            } else {
                System.out.println();
            }
        }
        scanner.close();
    }
}
