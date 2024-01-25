package Observer;

import Observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver {
    public String email;
    StockObservable observable;
    public EmailNotificationObserverImpl(StockObservable observable, String email){
        this.observable = observable;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail(email);
    }

    public void sendEmail(String email){
        System.out.println("Sending notification email to : "+ email);
    }
}
