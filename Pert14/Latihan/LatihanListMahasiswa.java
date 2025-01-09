package Pert14.Latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;
    
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }
    
    @Override
    public int compareTo(Mahasiswa m) {
        return this.nrp.compareTo(m.nrp);
    }
}

public class LatihanListMahasiswa {
    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();
        list.add(new Mahasiswa("202308011", "Alice"));
        list.add(new Mahasiswa("202308005", "Bob"));
        list.add(new Mahasiswa("202308015", "Charlie"));
        list.add(new Mahasiswa("202308009", "Diana"));
        
        // Tampilkan data asli
        System.out.println("Data asli:");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
        
        // Balik data
        Collections.reverse(list);
        System.out.println("\nData setelah dibalik:");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
        
        // Acak data
        Collections.shuffle(list);
        System.out.println("\nData setelah diacak:");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
        
        // Urutkan data berdasarkan NRP
        Collections.sort(list);
        System.out.println("\nData setelah diurutkan:");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}

