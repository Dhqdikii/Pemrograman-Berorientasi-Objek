package Pert13;

// Kelas Dosen
class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

// Kelas Rektor (Pewarisan dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Kelas Dekan (Pewarisan dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);

    }
}


// Kelas Utama untuk Menjalankan Program
public class MainGuru {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("1", "Diki");
        dosen.view();

        System.out.println();

        Rektor rektor = new Rektor("2", "Gabriella Abigail", 2023);
        rektor.viewRektor();

        System.out.println();

        Dekan dekan = new Dekan("3", "Oline Manuel", "Ilmu Komputer");
        dekan.viewDekan();
    }
}