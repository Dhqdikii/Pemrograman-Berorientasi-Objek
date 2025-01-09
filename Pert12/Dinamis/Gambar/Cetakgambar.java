package Pert12.Dinamis.Gambar;

public class Cetakgambar extends Bentuk{

    private void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama yaitu method gambar() dan hapus()
        // Pada masing-masing class
        for (int i=0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("======================================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = 
        {
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };
        Cetakgambar cetak = new Cetakgambar();

        // Menampilkan method gambar() dan hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("======================================");

        // Overriding 
        // Menumpuk method gambar() dan hapus() pada class Bentuk (superclass)
        // Dengan method gambar() dan hapus() pada subclass-nya
        // Yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);
    }
}