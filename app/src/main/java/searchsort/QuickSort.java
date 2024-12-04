package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {
        if (high <= low) return;               // Base case: subarray has 0 or 1 elements
        int p = partition(arr, low, high);
        quickSort(arr, low, p-1);             // Recursively sort left subarray
        quickSort(arr, p+1, high);            // Recursively sort right subarray
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high + 1;

        while (true) {
            // Move i to the right until an element >= pivot is found
            while (arr[++i] < arr[low]) {         
                if (i == high) break;
            }
            // Move j to the left until an element <= pivot is found
            while (arr[--j] > arr[low]) {
                if (j == low) break;
            }
            if (i >= j) break;           //check if pointers across
            Util.exch(arr, i, j);        //swap
        }
        
        Util.exch(arr, low, j);         //swap partitioning element
        return j;                      //return index of item now know to be in place

    }

}
