package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String msg){
        if(level == INFO){
            System.out.println("INFO: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
