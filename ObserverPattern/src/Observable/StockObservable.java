package Observable;

import Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySubscriber();

    public void setStock(int stock);

    public int getStockCount();
}
