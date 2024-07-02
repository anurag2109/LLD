package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class DebugLogger extends Logger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String msg){
        if(level == DEBUG){
            System.out.println("DEBUG: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
