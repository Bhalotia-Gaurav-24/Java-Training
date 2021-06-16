package com.pwc.interfaces;

public interface TaxCalculator {
   // final int defaultTax= 25;

    public default float getBaseTax() {
        return 2.3f;
    }

    public static float getDefaultTax(){

        return 5.5f;
    }

    public float calculateTax(String state, float baseTax);
  //  public float calculateStateTax();
}
