package Behavioral_Design_Patterns.Observer_Pattern;

import Behavioral_Design_Patterns.Observer_Pattern.observable.Observable;
import Behavioral_Design_Patterns.Observer_Pattern.observable.ObservableImpl;
import Behavioral_Design_Patterns.Observer_Pattern.observer.EmailObserver;
import Behavioral_Design_Patterns.Observer_Pattern.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Observable observableImpl = new ObservableImpl();

        Observer observer1 = new EmailObserver("anuragkarn21@gmail.com");
        Observer observer2 = new EmailObserver("xyz@gmail.com");

        observableImpl.addObserver(observer1);
        observableImpl.addObserver(observer2);

        observableImpl.setDate();
    }
}
