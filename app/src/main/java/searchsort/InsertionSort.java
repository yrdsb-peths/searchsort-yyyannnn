package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j]) {
                    Util.exch(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
}
