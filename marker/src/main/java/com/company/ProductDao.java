package com.company;

public class ProductDao {

    public static boolean checkForLiquid(Object obj) {

        if (obj instanceof Liquid) {
            return true;
        }
        return false;
    }
}
