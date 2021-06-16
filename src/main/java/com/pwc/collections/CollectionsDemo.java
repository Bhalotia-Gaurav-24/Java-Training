package com.pwc.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> values= new ArrayList<Integer>();
        values.add(123);
        values.add(24);
        values.add(58);
        values.add(61);
        values.add(37);
        System.out.println(values);



        /**
         * print only the values that are greater than 50
         */

        List<Integer> filteredValues = new ArrayList<>();
        for (Integer value : values) {
            if (value.intValue() > 50) {
                filteredValues.add(value);
            }
        }

        System.out.println(" --- ");
        System.out.println(filteredValues);
        System.out.println(" --- ");

        /**
         *
         * Map the values into string object concatenated with "Employee Code : "
         * + what ever is the code
         *
         */

        List<String> mappedValues = new ArrayList<>();
        for (Integer value : values) {

            mappedValues.add("Employee Code : " + value);
        }

        System.out.println(mappedValues);

        int min = values.get(0);
        int n= values.size();
        for(int i=1;i<n;i++)
        {
            if(values.get(i)<min)
            {min=values.get(i);}

        }
        System.out.println("*********************");
        System.out.println(min);


        List<Integer> values2= new LinkedList<Integer>();
        values2.add(123);
        values2.add(234);
        values2.add(345);
        values2.add(456);
        values2.add(567);
        System.out.println(values2);

        Set<Integer> values3 = new HashSet<>();
        values3.add(12);
        values3.add(12);
        values3.add(13);
        System.out.println(values3);

        Map<Integer, String> names = new HashMap<>();
        names.put(101, "Gaurav");
        names.put(102, "Aman");
        names.put(103, "Arun");

       System.out.println(names);

        for(Map.Entry<Integer, String> entry : names.entrySet())
        {
            System.out.println(entry.getKey() + " -- "
                    + entry.getValue() + " -- "
                    + names.containsValue("Gaurav"));
        }
    }
}
