public class Main {
    public static void main(String[] args) {
        // sorting via mergeSortStrategy
        NumberSort mergeSort = new MergeSort(new MergeSortStrategy());
        mergeSort.sortNumber();

        // sorting via quickSortStrategy
        NumberSort quickSort = new QuickSort(new QuickSortStrategy());
        quickSort.sortNumber();


    }
}