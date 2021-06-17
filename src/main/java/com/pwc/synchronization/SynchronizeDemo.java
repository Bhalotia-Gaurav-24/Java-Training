package com.pwc.synchronization;

public class SynchronizeDemo {

    volatile  int i=5;

    public static void main(String[] args) {
    SynchronizeDemo d= new SynchronizeDemo();
    d.i=10;
    // Not atomic
        if(d.i == 10)
        {
            d.i=15;
        }

    }
}

class MyInteger
{
    private int value;
    public synchronized void setValue(int value)
    {
        this.value=value;
    }
}