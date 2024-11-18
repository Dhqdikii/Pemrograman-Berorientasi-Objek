package Pert6;

public class CekKecepatanMobil {
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor dengan parameter
    public CekKecepatanMobil(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Konstruktor default (opsional jika ingin membuat objek tanpa parameter)
    public CekKecepatanMobil() {
        this.aktifitas = "belum diketahui";
        this.warna = "belum diketahui";
        this.kecepatan = 0;
    }

    // Metode untuk mengecek kecepatan dan menentukan aktivitas
    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";
        } else {
            aktifitas = "mengemudi";
        }
    }

    // Metode untuk mencetak atribut mobil
    void cetakAtribut() {
        System.out.print("\033[H\033[2J");
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dengan konstruktor
        CekKecepatanMobil mobilku = new CekKecepatanMobil("mengemudi", "Merah", 60);

        // Mengecek aktivitas berdasarkan kecepatan
        mobilku.cekKecepatan();

        // Mencetak atribut mobil
        mobilku.cetakAtribut();
    }
}
