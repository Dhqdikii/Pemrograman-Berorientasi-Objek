package Pert14.Latihan;

import java.util.HashSet;
import java.util.Set;

public class LatihanSet {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        
        // Mengisi himpunan A dan B
        for (int i = 1; i <= 5; i++) A.add(i);
        for (int i = 5; i <= 10; i++) B.add(i);
        
        // Operasi A - B
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);
        
        // Operasi A ∩ B
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B: " + intersection);
        
        // Operasi A ∪ B
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A ∪ B: " + union);
        
        // Operasi A ⊆ B
        boolean subset = B.containsAll(A);
        System.out.println("A ⊆ B: " + subset);
    }
}
