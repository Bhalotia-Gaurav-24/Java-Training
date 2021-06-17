package com.pwc.trainings.assignment;

public class Supplier implements Comparable<Supplier> {


    private Integer id;

    public Supplier() {


    }

    public Supplier(int id) {
        this.id = id;
    }

    protected void displayName() {

    }

    @Override
    public int compareTo(Supplier o) {

//        return o.id.compareTo(this.id);

        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                '}';
    }
}

