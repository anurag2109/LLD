package Creational_Design_Patterns.Singleton_Pattern.DoubleLocking;

import Creational_Design_Patterns.Singleton_Pattern.Syncronized.SyncronizedSingleTon;

public class DoubleLockingSingleTon {
    public static DoubleLockingSingleTon doubleLockingSingleTon;
    private DoubleLockingSingleTon(){

    }

    synchronized public static DoubleLockingSingleTon getInstance(){
        if(doubleLockingSingleTon == null){
            synchronized (DoubleLockingSingleTon.class){
                if(doubleLockingSingleTon == null){
                    doubleLockingSingleTon = new DoubleLockingSingleTon();
                }
            }
        }
        return doubleLockingSingleTon;
    }
}
