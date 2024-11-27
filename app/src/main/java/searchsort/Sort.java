package searchsort;

public abstract class Sort {
    abstract public void sort(int[] arr);

    /**
     * Sort the array and return the time taken in milliseconds.
     */
    public long timedSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        sort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
