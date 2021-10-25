package com.company;

public final class ClassSingleton2 {

    private static final ClassSingleton2 INSTANCE;

    static {
            INSTANCE = new ClassSingleton2();
    }

    public static ClassSingleton2 getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
