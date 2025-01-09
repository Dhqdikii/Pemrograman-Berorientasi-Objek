package Pert14.Latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        // Tampilkan data pada list
        System.out.println("Data asli: " + list);
        
        // Balik data pada list
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("Data setelah dibalik: " + reversedList);
        
        // Acak data pada list
        List<String> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Data setelah diacak: " + shuffledList);
        
        // Urutkan data pada list
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Data setelah diurutkan: " + sortedList);
    }
}

