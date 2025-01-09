package Pert12.Tugas.OperasiBilangan2.java.FinalClass;

import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Abstracts.OperasiBilanganAbs;

public final class OperasiBilanganAbsCetak {

    public void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (OperasiBilanganAbs operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }
}