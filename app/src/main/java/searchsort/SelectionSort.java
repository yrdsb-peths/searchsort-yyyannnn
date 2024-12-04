package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            int currentMinIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[currentMinIndex]) currentMinIndex = j;
            } 

            //swap numbers if needed
            if (i != currentMinIndex) {
                Util.exch(arr, i, currentMinIndex);
            }
        }
    }
}
