package com.fhilype;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
// 1st
        int a = 20;
        int b = 30;

        /*
            instead of this:
                int bigger;
                if (a > b) {
                    bigger = a;
                } else {
                    bigger = b;
                }
            do this:
        */
        int bigger = (a > b) ? a : b;

// 2nd
        int index = 0;
        List<String> strings = new ArrayList<>();
        for (String string : strings) {
            strings.get(index);
        /*
            instead of this:
            index = index + 1;

            -=Also=-
            you can use '--' or '++'
            if at start of sentence: '++index', it will increment before processing
            if at end of sentence: 'index++', it will increment after processing

            do this:
        */
            index++;
        }
// 3rd
        int i = 1;
        int j = 3;
        /*
            instead of this:
            i = i + j; // 4

            -=Also=-
            you can use '-=' or '+='

            do this:
        */
        i += j; // 4

// 4th
        /* Ways to initialize arrays */
        int size = 9;
        int[] array = null;
        int[] array1 = new int[3];
        int[] array2 = new int[size];
        int[] array3 = new int[]{1, 2, 3};
        int[] array4 = {1, 2, 3};

// 5th
        /*
            If you're dealing with media files, you should always do these steps:
                'try-with' block:
                Makes the compiler to know that the BufferedReader has to be closed
                after reading procedure, to release memory and avoiding future problems
        */
        String pathName = (new File("")).getAbsolutePath() + "/src/main/resources/file.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName))) {
            System.out.println(bufferedReader.readLine());
        }
// 6th
        /*
            instead of this:
            HashSet<String> stringHashSet = new HashSet<>();
            stringHashSet.add("0001");
            stringHashSet.add("0002");
            stringHashSet.add("0003");
            removeProducts(stringHashSet);
            do this: '{{ }}'
            Allowing you to use methods from locally instantiated object
        */
        removeProducts(new HashSet<String>() {{
            add("0001");
            add("0002");
            add("0003");
        }});

// 7th
        /*
            Diamond annotation '<>'
                Declaring type of ArrayList isn't necessary:
                    List<String> stringList = new ArrayList<String>();
            just do this:
        */
        List<String> stringList = new ArrayList<>();

// 8th
        /* Go to totalSum method description */
        System.out.println(totalSum(0.5, 5.5, 2.25, 4.75));

// 9th
        /* Go to ShoppingChart class description */
        ShoppingChart<Product> productShoppingChart = new ShoppingChart<>();
        ShoppingChart<Service> serviceShoppingChart = new ShoppingChart<>();
        productShoppingChart.addItem(new Product());
        serviceShoppingChart.addItem(new Service());
    }

    public static void removeProducts(HashSet<String> products) {
        int remains = products.size();
        for (String product : products) {
            System.out.println("Product: " + product + " has been removed.");
            System.out.println(--remains + " remaining.");
        }
    }

    /*
        Like this you declare that the method can receive an undefined quantity of items
        as params
    */
    public static Double totalSum(Double... items) {
        Double total = 0.0;
        for (Double item : items) {
            total += item;
        }
        return total;
    }

}