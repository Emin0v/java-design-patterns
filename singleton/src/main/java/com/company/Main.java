package com.company;

public class Main {

    public static void main(String[] args) {

        ClassSingleton1 classSingleton = ClassSingleton1.getInstance();
        ClassSingleton1 classSingleton1 = ClassSingleton1.getInstance();
        ClassSingleton1 classSingleton2 = ClassSingleton1.getInstance();

        System.out.println("classSingleton="+classSingleton+"\n"+"classSingleton1="+
                classSingleton1+"\n"+"classSingleton2="+ classSingleton2);


        System.out.println("--------------------------------------------------");

        ClassSingleton2 instance1 = ClassSingleton2.getInstance();
        ClassSingleton2 instance2 = ClassSingleton2.getInstance();
        ClassSingleton2 instance3 = ClassSingleton2.getInstance();

        System.out.println("classSingleton="+instance1+"\n"+"classSingleton1="+
                instance2+"\n"+"classSingleton2="+ instance3);


        System.out.println("--------------------------------------------------");

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton1.getInfo());

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("new EnumSingleton info");

        System.out.println(enumSingleton1.getInfo());
        System.out.println(enumSingleton2.getInfo());
    }
}
