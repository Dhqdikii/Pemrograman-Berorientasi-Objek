package Pert14.Tugas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TugasLinkedList {
    public static void main(String[] args) {
        // Membuat dua objek list
        List<String> warna = new ArrayList<>();
        List<String> warnaDihapus = new LinkedList<>();
        
        // Mengisi list warna
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");
        
        // Mengisi warnaDihapus dengan beberapa elemen yang sama
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        
        // Hapus data dari warna yang terdapat pada warnaDihapus
        warna.removeAll(warnaDihapus);
        
        // Tampilkan hasil
        System.out.println("Warna: " + warna);
    }
}
