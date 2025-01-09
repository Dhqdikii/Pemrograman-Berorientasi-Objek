package Pert12.Statis;

public class Overloading {
    public void Tampil() {
        System.out.println("I love java");
    }
    public void Tampil(int i) {
        System.out.println("Method dengan 1 Parameter = " +i);
    }
    public void Tampil(int i, int j) {
        System.out.println("Method dengan 2 Parameter = " +i+ " & " +j);
    }
    public void Tampil(String str) {
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        Overloading objek = new Overloading();
        objek.Tampil();
        objek.Tampil(8);
        objek.Tampil(6, 7);
        objek.Tampil("Hello World");
    }
}
