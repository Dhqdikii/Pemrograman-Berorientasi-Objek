package Pert14.Praktikum;

import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");
        while (stringQueue.size() > 0)
        System.out.println(stringQueue.remove());
    }
}