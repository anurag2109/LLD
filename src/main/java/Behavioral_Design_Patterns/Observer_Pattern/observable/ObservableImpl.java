package Behavioral_Design_Patterns.Observer_Pattern.observable;

import Behavioral_Design_Patterns.Observer_Pattern.observer.Observer;

public class ObservableImpl implements Observable{

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyMe() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setDate() {
        notifyMe();
    }
}
