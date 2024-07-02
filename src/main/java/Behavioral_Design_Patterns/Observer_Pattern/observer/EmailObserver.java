package Behavioral_Design_Patterns.Observer_Pattern.observer;

public class EmailObserver implements Observer{

    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Email sent to: "+email);
    }
}
