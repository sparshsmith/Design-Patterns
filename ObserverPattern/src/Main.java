import Observable.StockObservable;
import Observable.IPhoneStockObservableImpl;
import Observer.EmailNotificationObserverImpl;
import Observer.MobileAppNotificationObserverImpl;
import Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable observable = new IPhoneStockObservableImpl();
        NotificationObserver observer1 = new EmailNotificationObserverImpl(observable, "sparsh@email.com");
        NotificationObserver observer2 = new EmailNotificationObserverImpl(observable, "sparsh2@email.com");
        NotificationObserver observer3 = new MobileAppNotificationObserverImpl(observable, "splashy");
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.setStock(5);
    }
}