package com.pwc.basics;

public class ProductApp {
    public static void main(String args[]) throws Exception {
        Product.setTotalProductInInventory(20000);

        Product p1 = new Product();
        Product p2 = new Product(101);
        Product p3 = new Product(102, "Coffee", 1000);

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();

    }
}
