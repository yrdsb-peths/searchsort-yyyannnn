package searchsort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {

        // Test case 1: Unsorted array
        int[] input = { 5, 2, 9, 1, 5, 6 };
        int[] expected = { 1, 2, 5, 5, 6, 9 };

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort_AlreadySorted() {
        // Test case 2: Already sorted array
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort_Empty() {
        // Test case 3: Empty array
        int[] input = {};
        int[] expected = {};

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort_SingleElement() {
        // Test case 4: Single-element array
        int[] input = { 3 };
        int[] expected = { 3 };

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort_DuplicateElements() {
        // Test case 5: Array with duplicate elements
        int[] input = { 3, 1, 3, 2, 2 };
        int[] expected = { 1, 2, 2, 3, 3 };

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort_NegativeNumbers() {
        // Test case 6: Array with negative numbers
        int[] input = { -5, -2, -9, -1, -5, -6 };
        int[] expected = { -9, -6, -5, -5, -2, -1 };

        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }
}
