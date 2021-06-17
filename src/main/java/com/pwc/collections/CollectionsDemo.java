package com.pwc.collections;

import com.pwc.trainings.assignment.Supplier;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        /**
         * It is better to declare the reference of type Abstraction
         */
        List<Integer> values = new ArrayList<>();
        values.add(123);
        values.add(32);
        values.add(12);
        values.add(323);

        String s = null;

        System.out.println(values);

        Collections.sort(values);

        System.out.println(values);

        System.out.println(values.contains(33322));

        List<Supplier> suppliers = Arrays.asList(new Supplier(101), new Supplier(102));

        Collections.sort(suppliers);

        System.out.println(suppliers);




        if (true) {
            return;
        }


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
         * Map the values into string object concatenated with "Employee Code : " + what ever is the code
         *
         */

        List<String> mappedValues = new ArrayList<>();
        for (Integer value : values) {

            mappedValues.add("Employee Code : " + value);
        }

        System.out.println(mappedValues);
        System.out.println(values);

        /**
         * Get me the min value from the list of integer (values)
         *
         */

        List<Integer> values2 = new LinkedList<>();
        values2.add(123);
        values2.add(32);
        values2.add(12);
        values2.add(323);
        System.out.println(values2);


        Set<Integer> values3 = new HashSet<>();
        values3.add(12);
        values3.add(12);
        values3.add(13);

        System.out.println(values3);

        Map<Integer, String> names = new HashMap<>();

        names.put(101, "Shakir");
        names.put(102, "Farhan");
        names.put(103, "Murali");

        System.out.println(names);

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }


    }
}
