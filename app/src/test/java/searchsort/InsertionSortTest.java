package searchsort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testSortArray() {

        // Test case 1: Unsorted array
        int[] input = { 5, 2, 9, 1, 5, 6 };
        int[] expected = { 1, 2, 5, 5, 6, 9 };

        // Call the sort method
        InsertionSort.sort(input);

        // Check if the sorted array matches the expected array
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortArray_AlreadySorted() {
        // Test case 2: Already sorted array
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        InsertionSort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortArray_Empty() {
        // Test case 3: Empty array
        int[] input = {};
        int[] expected = {};

        InsertionSort.sort(input);

        assertArrayEquals(expected, input);
    }
}
