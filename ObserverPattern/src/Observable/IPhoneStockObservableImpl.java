package Observable;

import Observer.NotificationObserver;
import java.util.*;

public class IPhoneStockObservableImpl implements StockObservable{
    List<NotificationObserver> observerList = new ArrayList<>();
    int stocks;
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStock(int newStocks) {
        if(stocks == 0){
            notifySubscriber();
        }
        stocks += newStocks;
    }

    @Override
    public int getStockCount(){
        return stocks;
    }
}
