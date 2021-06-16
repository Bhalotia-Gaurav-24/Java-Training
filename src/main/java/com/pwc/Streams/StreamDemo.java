package com.pwc.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

//        List<Integer> values = new ArrayList<>();
//        values.add(123);
//        values.add(323);

        List<Integer> values = Arrays.asList(12, 40, 45, 75, 100, 200);

        /**
         * filter out all those elements which are greater than 50
         *
         */

//        Predicate<Integer> testForValueGreaterThan50 = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer value) {
//
//                if (value > 50) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } ;


//        Predicate<Integer> testForValueGreaterThan50 = value -> value > 50;


        System.out.println(filterMyValues(values, (value) -> value < 15));


        Predicate<Integer> filterPredicate = (value) -> value < 15;
        List<Integer> filteredValues = filterMyValues(values, filterPredicate);
        System.out.println(filteredValues);

        Function<Integer, String> mapFunction = x -> "Employee Code: " + x;
        List<String> mappedValues = mapMyValues(values, mapFunction);
        System.out.println(mappedValues);

        OptionalInt minValue = values
                .stream()
                .mapToInt(x -> x.intValue())
                .max();

        if (((OptionalInt) minValue).isPresent()) {
            System.out.println(minValue.getAsInt());
        }
        List<String> mappedAndFilteredValues =
                values.stream()
                        .filter(x -> x < 12)
                        .map(x -> "Employee Id : " + x)
                        .collect(Collectors.toList());

        System.out.println("---------");
        System.out.println(mappedAndFilteredValues);


        Function <Integer,Integer> f1 = null;
        Supplier <Integer> f2= null;
        Consumer< Integer> f3 = null;
        Predicate<String> f4 = null;



    }

    public static List<Integer> filterMyValues(List<Integer> values, Predicate<Integer> predicate) {
        List<Integer> filteredValues =
                values
                        .stream()
                        .filter(predicate)
                        .collect(Collectors.toList());

        return filteredValues;

    }



    /**
     * You must map the List of Integer to List of String with each value in the list of string concatenated
     * with "Employee Code : " + what ever the code
     */
    public static List<String> mapMyValues(List<Integer> values, Function<Integer, String> mapFunction) {


        List<String> mappedList =
                values
                        .stream()
                        // higher order function is map
                        .map(mapFunction)
                        .collect(Collectors.toList());

        return mappedList;

    }

}
