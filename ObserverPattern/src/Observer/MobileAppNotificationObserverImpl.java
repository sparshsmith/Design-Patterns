package Observer;

import Observable.StockObservable;

public class MobileAppNotificationObserverImpl implements NotificationObserver {
    String username;
    StockObservable observable;

    public MobileAppNotificationObserverImpl(StockObservable observable, String username){
        this.observable = observable;
        this.username = username;
    }
    @Override
    public void update() {
        System.out.println("Sending mobile app notification to user: "+ username);
    }
}
