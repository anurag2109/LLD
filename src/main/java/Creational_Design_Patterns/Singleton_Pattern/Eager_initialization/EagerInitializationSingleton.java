package Creational_Design_Patterns.Singleton_Pattern.Eager_initialization;

public class EagerInitializationSingleton {

    // create object here so that at the time of contructor call it will create obj
    public static EagerInitializationSingleton  eagerInitializationSingletonObj = new EagerInitializationSingleton();
    private EagerInitializationSingleton(){}
    public static EagerInitializationSingleton getInstance(){
        return eagerInitializationSingletonObj;
    }
}
