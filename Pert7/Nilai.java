package Pert7;

public class Nilai {
    private int tugas;
    private int uts;
    private int uas;

    public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas + uts + uas) / 3.0;
    }

    public String tentukanPredikat() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}

class SimpleGradeTester {
    public static void main(String[] args) {
        Nilai gradeCalculator = new Nilai();
        
        gradeCalculator.setTugas(85);
        gradeCalculator.setUts(75);
        gradeCalculator.setUas(90);

        System.out.print("\033[H\033[2J");
        System.out.println("Nilai Akhir: " + gradeCalculator.hitungNilaiAkhir());
        System.out.println("Predikat: " + gradeCalculator.tentukanPredikat());
    }
}
