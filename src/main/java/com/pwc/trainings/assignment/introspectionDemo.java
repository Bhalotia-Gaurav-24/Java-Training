package com.pwc.trainings.assignment;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class introspectionDemo {

    public static void main(String[] args) throws ClassNotFoundException
    {
        String className = "com.pwc.trainings.assignment.Customer";
        Class c  = Class.forName(className);

        Method[] method = c.getDeclaredMethods();
        Field[] fields = c.getDeclaredFields();

        for(Method m: method) {
            System.out.println(m.getName());
        }

        for(Field f: fields) {
            System.out.println(f.getName());
        }

    }
}
