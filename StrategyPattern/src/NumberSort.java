public class NumberSort {
    SortStrategy strategy;

    NumberSort(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sortNumber(){
        strategy.sort();
    }
}
