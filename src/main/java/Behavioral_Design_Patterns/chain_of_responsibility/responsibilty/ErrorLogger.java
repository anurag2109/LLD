package Behavioral_Design_Patterns.chain_of_responsibility.responsibilty;

public class ErrorLogger extends Logger{

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String msg){
        if(level == ERROR){
            System.out.println("ERROR: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
