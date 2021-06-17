package com.pwc.generics;

public class GenericsDemo <T> {

    public void printDetails(T t) {

        System.out.println(t);

    }

    public static void main(String[] args) {
        GenericsDemo<Integer> gd = new GenericsDemo<>();
        gd.printDetails(3);


    }



}
