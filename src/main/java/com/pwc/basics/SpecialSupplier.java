package com.pwc.basics;

import com.pwc.trainings.assignment.Supplier;

public class SpecialSupplier extends Supplier {

    /**
     * Protected can be accessed from out of the package only in classes
     * that are inherited
     */
    public void displayAllDetails() {
        super.displayName();

    }
}
