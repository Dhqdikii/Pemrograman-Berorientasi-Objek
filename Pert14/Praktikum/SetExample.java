package Pert14.Praktikum;


import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Membuat dua set dengan elemen awal
        Set<String> s1 = new HashSet<>();
        s1.add("Australia");
        s1.add("Sweden");
        s1.add("Germany");

        Set<String> s2 = new HashSet<>();
        s2.add("Sweden");
        s2.add("France");

        // Menghitung union (gabungan) dari s1 dan s2
        Set<String> union = new TreeSet<>(s1); // TreeSet untuk hasil yang terurut
        union.addAll(s2);
        print("Union", union);

        // Menghitung intersection (irisan) dari s1 dan s2
        Set<String> intersect = new TreeSet<>(s1);
        intersect.retainAll(s2);
        print("Intersection", intersect);
    }

    // Metode untuk mencetak elemen dalam koleksi dengan label
    protected static void print(String label, Collection<String> c) {
        System.out.println("---------------- " + label + " ----------------");
        for (String element : c) {
            System.out.println(element);
        }
    }
}
