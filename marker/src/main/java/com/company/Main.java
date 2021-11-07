package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> list = new ArrayList();

        list.add(new Wine());
        list.add(new Meat());

        for (Object obj : list) {
            if (ProductDao.checkForLiquid(obj)) {
                if (obj instanceof Drinkable drinkable) {
                    drinkable.drink();
                }
                System.out.println("This is liquid");
            }else if(obj instanceof Eatable eatable){
                eatable.eat();
            }
        }

    }
}
