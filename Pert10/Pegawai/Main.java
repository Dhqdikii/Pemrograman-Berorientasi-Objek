package Pert10.Pegawai;

class Pegawai {
    String nama;
    int id_pegawai;
    String gaji;

    // Method untuk menampilkan informasi pegawai
    void menampilkan() {
        System.out.println("Nama: " + nama + ", ID Pegawai: " + id_pegawai + ", Gaji: " + gaji);
    }
}

class Manager extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Mengelola dan memimpin tim.");
    }
}

class Kasir extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Melayani transaksi pelanggan.");
    }
}

class Koki extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Menyiapkan dan memasak makanan.");
    }
}

class Pelayan extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Melayani tamu di restoran.");
    }
}

class Satpam extends Pegawai {
    void tugas() {
        System.out.println("Tugas: Menjaga keamanan.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Memasukkan nilai variabel menggunakan objek
        manager.nama = "Sifa";
        manager.id_pegawai = 1;
        manager.gaji = "7 Juta";

        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1,2 Juta";

        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = "2 Juta";

        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 Juta";

        satpam.nama = "Budi";
        satpam.id_pegawai = 5;
        satpam.gaji = "1 Juta";

        // Memanggil fungsi pada superclass dan subclass
        System.out.print("\033[H\033[2J");
        System.out.println("=== Data Pegawai ===");
        manager.menampilkan();
        manager.tugas();

        kasir.menampilkan();
        kasir.tugas();

        koki.menampilkan();
        koki.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();
        satpam.tugas();
    }
}