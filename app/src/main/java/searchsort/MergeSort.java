package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int[] aux, int lo, int hi) {
        //Array is sorted if lo is greater than hi
        if(lo >= hi) {
            return;
        }

        int mid = (lo + hi) /2;              //middle element
        mergeSort(arr, aux, lo, mid);       //sort left side of array
        mergeSort(arr, aux, mid + 1, hi);    //sort right side of array
        merge(arr, aux, lo, mid, hi);     //combine both halves 
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {           //copy
            aux[k] = arr[k];  
        }

        int i = lo;                               //left side index
        int j = mid + 1;                          //left side index

        for (int k = lo; k <= hi; k++) {         //merge
            if (i>mid) {                         //left is exhausted
                arr[k] = aux[j];                 // or arr[k] = aux[j++]
                j++;
            } else if (j > hi) {                //right is exhausted
                arr[k] = aux[i];
            } else if (aux[j] < aux[i]) {       //right element smaller than left
                arr[k] = aux[j];
                j++;
            } else {                           //left element smaller than right
                arr[k] = aux[i];
                i++;
            }
        }
    }
}
