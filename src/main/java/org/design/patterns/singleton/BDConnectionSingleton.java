package org.design.patterns.singleton;

public class BDConnectionSingleton {
    private static BDConnectionSingleton instance;

    private BDConnectionSingleton() {
        System.out.println("Successful connection");
    }

    public static BDConnectionSingleton getInstance() {
        if (instance == null) instance = new BDConnectionSingleton();
        return instance;
    }
}
