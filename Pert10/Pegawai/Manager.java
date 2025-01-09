package Pert10.Pegawai;

public class Manager extends Pegawai {
    // Tambahkan @Override di atas fungsi void menampilkan().
    // @Override berfungsi untuk mendefinisikan ulang method dari superclass untuk subclass.
    @Override
    public void menampilkan() {
        // Nilai dari void menampilkan bisa berbeda dari nilai yang ada pada superclass.
        System.out.println("Nama : " + nama);
        System.out.println("Id Pegawai : " + id_pegawai);
        System.out.println("Gaji : " + gaji);
    }

    // Fungsi void tugas() merupakan fungsi spesifik yang hanya dimiliki oleh class Manager.
    public void tugas() {
        System.out.println("Tugas : Melakukan manajemen untuk franchise");
    }
}
