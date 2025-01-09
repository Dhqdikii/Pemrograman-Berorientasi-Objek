package Pert12.Tugas;

public class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Pengurangan: " +a+ "-" +b+ "=" +c);
    }
}