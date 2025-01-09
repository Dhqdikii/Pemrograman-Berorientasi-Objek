package Pert14.Tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;
    private int nilai;

    public Mahasiswa(String nrp, String nama, int nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama + ", Nilai: " + nilai;
    }

    @Override
    public int compareTo(Mahasiswa m) {
        return Integer.compare(this.nilai, m.nilai);
    }
}

public class TugasPengurutanMahasiswa {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Random rand = new Random();
        
        // Menambahkan 10 data mahasiswa
        mahasiswaList.add(new Mahasiswa("202308001", "Alice", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308002", "Bob", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308003", "Charlie", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308004", "Diana", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308005", "Eve", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308006", "Frank", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308007", "Grace", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308008", "Hank", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308009", "Ivy", rand.nextInt(41) + 60));
        mahasiswaList.add(new Mahasiswa("202308010", "Jack", rand.nextInt(41) + 60));
        
        // Tampilkan data sebelum diurutkan
        System.out.println("Data Mahasiswa sebelum diurutkan:");
        for (Mahasiswa m : mahasiswaList) {
            System.out.println(m);
        }
        
        // Urutkan data berdasarkan nilai
        Collections.sort(mahasiswaList);
        
        // Tampilkan data setelah diurutkan
        System.out.println("\nData Mahasiswa setelah diurutkan berdasarkan nilai:");
        for (Mahasiswa m : mahasiswaList) {
            System.out.println(m);
        }
    }
}

