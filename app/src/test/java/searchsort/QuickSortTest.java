package searchsort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    private final Sort quickSort = new QuickSort();

    @Test
    public void testQuickSort() {

        // Test case 1: Unsorted array
        int[] input = { 5, 2, 9, 1, 5, 6 };
        int[] expected = { 1, 2, 5, 5, 6, 9 };

        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_AlreadySorted() {
        // Test case 2: Already sorted array
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_Empty() {
        // Test case 3: Empty array
        int[] input = {};
        int[] expected = {};

        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_SingleElement() {
        // Test case 4: Single-element array
        int[] input = { 3 };
        int[] expected = { 3 };

        quickSort.sort(input);
        assertArrayEquals(expected, input);
    }
}
