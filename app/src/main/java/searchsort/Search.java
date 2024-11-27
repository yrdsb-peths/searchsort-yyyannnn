package searchsort;

public abstract class Search {
    abstract public int find(int[] arr, int target);

    /**
     * Return the time taken to execute a search operation.
     */
    protected long timedFind(int[] arr, int target) {
        long startTime = System.nanoTime();
        find(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
