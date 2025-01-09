package Pert14.Praktikum;

import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
    public static void main(String[] args) {
        // Membuat dua set untuk menyimpan elemen unik dan duplikat
        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();

        // Iterasi melalui argumen yang diberikan
        for (String a : args) {
            // Jika elemen sudah ada di 'uniques', tambahkan ke 'dups'
            if (!uniques.add(a)) {
                dups.add(a);
            }
        }

        // Menghapus semua elemen duplikat dari 'uniques'
        uniques.removeAll(dups);

        // Menampilkan hasil
        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
