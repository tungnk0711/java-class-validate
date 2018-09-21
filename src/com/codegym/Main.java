package com.codegym;

public class Main {

    private static ClassExample classExample;

    public static final String validClass = "C0331I";


    public static void main(String args[]) {
        classExample = new ClassExample();
        boolean isvalid = classExample.validate(validClass);
        System.out.println("Class is " + validClass + " is valid: " + isvalid);

    }
}

