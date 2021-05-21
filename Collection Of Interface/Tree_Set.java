package com.anna.msc;

import java.util.*;

public class Tree_Set {
    public static void main(String[] args) {

        TreeSet<Integer> Numbers = new TreeSet<>();

        // Using the add() method
        Numbers.add(9);
        Numbers.add(10);
        Numbers.add(18);
        System.out.println("TreeSet: " + Numbers);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(11);

        // Using the addAll() method
        numbers2.addAll(Numbers);
        System.out.println("New TreeSet: " + numbers2);
    }
}