package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

            for(int i = 0; i < numbers.length ; i++ ) {
                if (numbers[i] == 5) {
                    break;
                }
                System.out.println(numbers[i]);
            }


        // Второе задание

        ArrayList<String> names = new ArrayList<>(10);
            names.add("Vadim1");
            names.add("Vadim2");
            names.add("Vadim3");
            names.add("Vadim4");
            names.add("Vadim5");
            names.add("Vadim6");
            names.add("Vadim7");
            names.add("Vadim8");
            names.add("Vadim9");
            names.add("Vadim10");

            for(String name : names ){
                System.out.println(name);

            }

    }


}