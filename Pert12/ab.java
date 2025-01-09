package Pert12;
// Abstract class
abstract class OperasiBilanganAbs {
    protected double a, b, c;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract void tampil();
}

// Subclass Penjumlahan
class OperasiPenjumlahan extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) { this.a = a; }
    @Override
    protected void set_B(double b) { this.b = b; }
    @Override
    protected double get_A() { return a; }
    @Override
    protected double get_B() { return b; }
    
    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Hasil Penjumlahan: " + c);
    }
}

// Subclass Pengurangan
class OperasiPengurangan extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) { this.a = a; }
    @Override
    protected void set_B(double b) { this.b = b; }
    @Override
    protected double get_A() { return a; }
    @Override
    protected double get_B() { return b; }
    
    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Hasil Pengurangan: " + c);
    }
}

// Subclass Perkalian
class OperasiPerkalian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) { this.a = a; }
    @Override
    protected void set_B(double b) { this.b = b; }
    @Override
    protected double get_A() { return a; }
    @Override
    protected double get_B() { return b; }
    
    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Hasil Perkalian: " + c);
    }
}

// Subclass Pembagian
class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) { this.a = a; }
    @Override
    protected void set_B(double b) { this.b = b; }
    @Override
    protected double get_A() { return a; }
    @Override
    protected double get_B() { return b; }
    
    @Override
    protected void tampil() {
        if (b != 0) {
            c = a / b;
            System.out.println("Hasil Pembagian: " + c);
        } else {
            System.out.println("Error: Pembagian dengan nol!");
        }
    }
}

// Final class untuk mencetak hasil semua operasi
final class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs OB, double a, double b) {
        OB.set_A(a);
        OB.set_B(b);
        OB.tampil();
    }
    
    public static void main(String[] args) {
        double A = 6.5, B = 0.5;
        
        OperasiBilanganAbsCetak printer = new OperasiBilanganAbsCetak();
        
        // Penjumlahan
        OperasiBilanganAbs penjumlahan = new OperasiPenjumlahan();
        printer.cetakSemua(penjumlahan, A, B);
        
        // Pengurangan
        OperasiBilanganAbs pengurangan = new OperasiPengurangan();
        printer.cetakSemua(pengurangan, A, B);
        
        // Perkalian
        OperasiBilanganAbs perkalian = new OperasiPerkalian();
        printer.cetakSemua(perkalian, A, B);
        
        // Pembagian
        OperasiBilanganAbs pembagian = new OperasiPembagian();
        printer.cetakSemua(pembagian, A, B);
    }
}
