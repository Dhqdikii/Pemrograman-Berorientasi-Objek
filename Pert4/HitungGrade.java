package Pert4;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        // Mengambil input
        System.out.print("Masukkan nilai: ");
        nilai = scan.nextInt();

        // Cek grade
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Tampilkan grade
        System.out.println("Grade Anda: " + grade);

        // Tutup scanner
        scan.close();
    }
}
