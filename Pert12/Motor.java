package Pert12;

// Kelas abstrak Kendaraan
abstract class Kendaraan {
    String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void bergerak();

    // Method non-abstrak
    public void info() {
        System.out.print("\033[H\033[2J");
        System.out.println("Kendaraan ini adalah: " + nama);
    }
}

// Interface Mesin
interface Mesin {
    void startMesin();
    void stopMesin();
}

// Kelas konkrit Motor
public class Motor extends Kendaraan implements Mesin {
    private String tipe; // Tambahan atribut tipe motor

    public Motor(String nama, String tipe) {
        super(nama);
        this.tipe = tipe;
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + tipe + " bergerak di jalan raya.");
    }

    @Override
    public void startMesin() {
        System.out.println("Mesin motor " + tipe + " dinyalakan.");
    }

    @Override
    public void stopMesin() {
        System.out.println("Mesin motor " + tipe + " dimatikan.");
    }

    // Tambahan info spesifik R1M
    public void infoSpesifik() {
        System.out.println("Motor " + tipe + " adalah motor sport kelas atas dengan performa tinggi.");
    }

    // Main method
    public static void main(String[] args) {
        // Membuat objek Motor R1M
        Motor motor = new Motor("Yamaha", "R1M");
        motor.info();
        motor.startMesin();
        motor.bergerak();
        motor.stopMesin();
        motor.infoSpesifik();
    }
}
