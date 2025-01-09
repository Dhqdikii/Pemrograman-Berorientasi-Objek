package Pert13;

// Interface Transportasi
interface Transportasi {
    int getId();
    void tampil();
    void setData();
}

// Superclass Gojek
class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    public Gojek(int id, int harga) {
        this.id = id;
        this.harga = harga;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void tampil() {
        System.out.println("Gojek - ID: " + id + ", Harga: " + harga);
    }

    @Override
    public void setData() {
        this.harga = 10000; // Default harga
        System.out.println("Data Gojek di-set dengan harga: " + harga);
    }
}

// Subclass Bayar
class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar(int id, int harga, int jarak, String nama) {
        super(id, harga);
        this.jarak = jarak;
        this.nama = nama;
        hitungTotal();
    }

    private void hitungTotal() {
        this.total = jarak * harga;
    }

    @Override
    public void tampil() {
        System.out.println("Bayar - Nama: " + nama);
        System.out.println("ID: " + id + ", Jarak: " + jarak + " km, Total Bayar: " + total);
    }

    @Override
    public void setData() {
        super.setData();
        this.jarak = 15; // Default jarak
        this.nama = "Customer";
        hitungTotal();
        System.out.println("Data Bayar di-set: Jarak = " + jarak + ", Nama = " + nama);
    }
}

// Main Program
public class MainGojek {
    public static void main(String[] args) {
        // Membuat objek Gojek
        Gojek gojek = new Gojek(101, 5000);
        gojek.setData();
        gojek.tampil();

        // Membuat objek Bayar
        Bayar bayar = new Bayar(102, 4000, 10, "Budi");
        bayar.setData();
        bayar.tampil();
    }
}
