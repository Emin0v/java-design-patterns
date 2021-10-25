package com.company;

public final class ClassSingleton1 {

    private static ClassSingleton1 INSTANCE;

    private ClassSingleton1(){

    }

    public static ClassSingleton1 getInstance(){
        if(INSTANCE==null){
            synchronized (ClassSingleton1.class) {
                if (INSTANCE == null){
                    INSTANCE = new ClassSingleton1();
                }
            }
        }

        return INSTANCE;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
