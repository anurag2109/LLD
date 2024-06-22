package Creational_Design_Patterns.Singleton_Pattern;

import Creational_Design_Patterns.Singleton_Pattern.DoubleLocking.DoubleLockingSingleTon;
import Creational_Design_Patterns.Singleton_Pattern.Eager_initialization.EagerInitializationSingleton;
import Creational_Design_Patterns.Singleton_Pattern.Lazy_initialization.LazyInitializationSingleton;
import Creational_Design_Patterns.Singleton_Pattern.Syncronized.SyncronizedSingleTon;

public class Main {
    public static void main(String[] args) {

        LazyInitializationSingleton lazyobj1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyobj2 = LazyInitializationSingleton.getInstance();

        System.out.println("Lazy: "+lazyobj1.hashCode()+" : "+lazyobj2.hashCode()+" = "+String.valueOf(lazyobj1.hashCode()).equals(String.valueOf(lazyobj2.hashCode())));

        EagerInitializationSingleton eagerInitializationSingletonObj1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton eagerInitializationSingletonObj2 = EagerInitializationSingleton.getInstance();
        System.out.println("Eager: "+eagerInitializationSingletonObj1.hashCode()+" : "+eagerInitializationSingletonObj2.hashCode()+" = "+String.valueOf(eagerInitializationSingletonObj1.hashCode()).equals(String.valueOf(eagerInitializationSingletonObj2.hashCode())));


        SyncronizedSingleTon syncronizedSingleTonObj1 = SyncronizedSingleTon.getInstance();
        SyncronizedSingleTon syncronizedSingleTonObj2 = SyncronizedSingleTon.getInstance();
        System.out.println("SyncronizedSingleTon: "+syncronizedSingleTonObj1.hashCode()+" : "+syncronizedSingleTonObj2.hashCode()+" = "+String.valueOf(syncronizedSingleTonObj1.hashCode()).equals(String.valueOf(syncronizedSingleTonObj2.hashCode())));

        DoubleLockingSingleTon doubleLockingSingleTonObj1 = DoubleLockingSingleTon.getInstance();
        DoubleLockingSingleTon doubleLockingSingleTonObj2 = DoubleLockingSingleTon.getInstance();
        System.out.println("DoubleLockingSingleTon: "+doubleLockingSingleTonObj1.hashCode()+" : "+doubleLockingSingleTonObj2.hashCode()+" = "+String.valueOf(doubleLockingSingleTonObj1.hashCode()).equals(String.valueOf(doubleLockingSingleTonObj2.hashCode())));

    }
}
