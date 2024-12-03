package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length -1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if(target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveFindHelper(arr, target, 0, arr.length-1);
    }

    private int recursiveFindHelper(int[] arr, int target, int lo, int hi) {
        if(lo > hi) {
            return -1;
        }

        int mid = (lo + hi)/2;

        if(target == arr[mid]) {
            return mid;
        }

        if(target > mid) {
            return recursiveFindHelper(arr, target, mid+1, hi);
        } 

        return recursiveFindHelper(arr, target, lo, mid-1);
    }

}
