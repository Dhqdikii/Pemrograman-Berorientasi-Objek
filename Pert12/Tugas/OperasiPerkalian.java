package Pert12.Tugas;

public class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Perkalian: " +a+ "*" +b+ "=" +c);
    }
}