package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        }
        
        Sort sort = new QuickSort();
        sort.sort(arr);
        int mid = (arr.length-1)/2;

        if(arr.length%2 == 0) {
            return (arr[mid] + arr[mid+2])/2;
        }
    
        return arr[mid];
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        }
        
        Sort sort = new MergeSort();
        sort.sort(arr);
        int mid = (arr.length-1)/2;

        if(arr.length%2 == 0) {
            return (arr[mid] + arr[mid+2])/2;
        }
    
        return arr[mid];
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        }

        InsertionSort.sort(arr);
        int mid = (arr.length-1)/2;

        if(arr.length%2 == 0) {
            return (arr[mid] + arr[mid+2])/2;
        }
    
        return arr[mid];
    }

}
