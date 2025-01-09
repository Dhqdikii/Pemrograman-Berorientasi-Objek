package Pert12.Tugas;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Penjumlahan: " +a+ "+" +b+ "=" +c);
    }
}