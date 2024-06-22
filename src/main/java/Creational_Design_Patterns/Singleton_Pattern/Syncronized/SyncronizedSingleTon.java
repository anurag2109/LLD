package Creational_Design_Patterns.Singleton_Pattern.Syncronized;

public class SyncronizedSingleTon {
    public static SyncronizedSingleTon syncronizedSingleTon;
    private SyncronizedSingleTon(){

    }

    synchronized public static SyncronizedSingleTon getInstance(){
        if(syncronizedSingleTon == null){
            syncronizedSingleTon = new SyncronizedSingleTon();
        }
        return syncronizedSingleTon;
    }
}
