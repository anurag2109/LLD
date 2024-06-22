package Creational_Design_Patterns.Singleton_Pattern.Lazy_initialization;

public class LazyInitializationSingleton {
    public static LazyInitializationSingleton singletonObj;

    private LazyInitializationSingleton(){
    }

    public static LazyInitializationSingleton getInstance(){
        if(singletonObj == null){
            singletonObj = new LazyInitializationSingleton();
        } 
        return singletonObj;
    }
}
