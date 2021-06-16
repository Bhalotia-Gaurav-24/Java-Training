package com.pwc.interfaces;

public class InvoiceAppWithFunctionInterface {

    public static void main(String[] args) {


        TaxCalculator calculator = new TaxCalculator() {

            @Override
            public float calculateTax(String state, float baseTax) {
                /**
                 * some calculation
                 */
                return 3.5f;

            }
        };
//        TaxCalculator calculator1 =() -> {
//            return 3.5f;
//        };
//
//        TaxCalculator calculator2 = () -> 3.5f;
        TaxCalculator calculator1= (x,y)->(x.equals("Maha") ? 1.4f + 1.5f: 5.5f)+y;
        generateTaxSlips(calculator1);

        generateTaxSlips((x,y)->y + 2.3f);
        generateTaxSlips((x, y) -> y + 5.3f);
        generateTaxSlips((x, y) -> y + 8.3f);
        generateTaxSlips((x, y) -> y + 10.3f);


        System.out.println( calculator1.calculateTax ("Chennai", 4.4f));
    }
    public static void generateTaxSlips(TaxCalculator calculator){
        calculator.calculateTax("Maha", 4.4f);
    }
}
