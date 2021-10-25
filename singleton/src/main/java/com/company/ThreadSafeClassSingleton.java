package com.company;

public final class ThreadSafeClassSingleton {

    private static volatile ThreadSafeClassSingleton instance;

    private ThreadSafeClassSingleton(){
        // to prevent instantiating by Reflection call
        if(instance!=null){
            throw new IllegalStateException("Already initialized");
        }
    }

    public static ThreadSafeClassSingleton getInstance(){
        //local variable increases performance by 25 percent
        var result = instance;

        if(result==null){
            synchronized (ThreadSafeClassSingleton.class){
                result=instance;
                if(result==null){
                    instance=result=new ThreadSafeClassSingleton();
                }
            }
        }
        return result;

    }

}
