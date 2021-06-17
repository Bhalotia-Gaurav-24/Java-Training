package com.pwc.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasMapDemo {
    public static void main(String[] args) {

// Not Thread Safe(1.2)
        HashMap<Integer, String> hashMap = new HashMap<>();
// Thread Safe(1.0)
        /**
         * One thread at a time will be able write
         */
        Hashtable <Integer, String> map2 = new Hashtable<>();


        //Thread safe
        /**
         *
         */
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
    }
}
