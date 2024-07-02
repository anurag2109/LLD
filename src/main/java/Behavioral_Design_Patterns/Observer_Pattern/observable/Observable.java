package Behavioral_Design_Patterns.Observer_Pattern.observable;

import Behavioral_Design_Patterns.Observer_Pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
    public List<Observer> observerList = new ArrayList<>();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyMe();

    void setDate();
}
