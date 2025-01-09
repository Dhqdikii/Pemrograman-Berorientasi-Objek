package Pert14.Praktikum;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration; // Tambahkan import ini

public class CreateArrayListFromEnumerationExample { 
    public static void main(String[] args) { 
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F"); 
        System.out.println("Vector contains : " + v);
        Enumeration<String> e = v.elements(); // Pastikan tipe data Enumeration sama dengan Vector
        ArrayList<String> aList = Collections.list(e); 
        System.out.println("Arraylist contains : " + aList); 
    }
}
