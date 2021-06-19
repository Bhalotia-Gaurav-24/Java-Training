package com.pwc.streambymyself;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAndMapToIntDemo {
    public static void main(String[] args) throws Exception {

        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");
        list
                .stream()
                .mapToInt(str -> Integer.parseInt(str))
                .filter(num -> num % 3 == 0).
                forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        List<String> list2 = Arrays.asList("Geeks", "for", "gfg",
                "GeeksforGeeks", "GeeksQuiz");

        // print the length of each string in list2
        list2.stream().
                mapToInt(str -> str.length())
                .forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(3, 6, 8, 14, 15);

        Function<Integer, String> mapped = val -> "Code id" + val;
        List<String> maapingcontinued = mapmyvalue(list3, mapped);
        System.out.println(maapingcontinued);



    }


    public static List<String> mapmyvalue(List<Integer> list3, Function<Integer, String> mapped) {
        List<String> mappingdone=
        list3.stream()
                .map(mapped)
                .collect(Collectors.toList());
        return mappingdone;
    }



}
