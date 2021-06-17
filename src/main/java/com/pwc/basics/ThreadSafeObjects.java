package com.pwc.basics;

import java.util.*;

public class ThreadSafeObjects {

    /**
     * Not Thread Safe
     */
    ArrayList l = new ArrayList();
    HashMap m = new HashMap();
    Date d = new Date();
    StringBuilder builder = new StringBuilder();


    /**
     * Thread Safe
     */
    Vector v = new Vector();
    Hashtable t = new Hashtable();
    StringBuffer buffer = new StringBuffer();

}
