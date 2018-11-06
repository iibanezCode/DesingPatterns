package com.company;

public class Singleton {

    //The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it is being initialized to the singleton instance
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance ==null ){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance =new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
