package com.pwc.reflection;

import com.pwc.basics.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection is to introspect on the structure of the class
 */
public class ReflectionDemo {

    public static void main(String[] args) throws Throwable {

//        Employee e = new Employee();
//        Class c2 = e.getClass();


        Class c = Employee.class;
        c.getDeclaredConstructors();

        Object o = c.newInstance();

        Class c2 = int[].class;


        Method[] methods = c.getDeclaredMethods();
        methods[0].invoke(o, new Object[]{});

        Field[] fields = c.getDeclaredFields();

        fields[0].setAccessible(true);
        fields[0].get(o);


        fields[0].set(o, "asd");


    }
}

