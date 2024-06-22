package Creational_Design_Patterns.Singleton_Pattern;
import Creational_Design_Patterns.Singleton_Pattern.Lazy_initialization.LazyInitializationSingleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    public void singletonTest(){
        LazyInitializationSingleton singleton1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton singleton2 = LazyInitializationSingleton.getInstance();
        assertSame(singleton1, singleton2);
    }
}
