package searchsort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    @Test
    public void testFindElementPresent() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = LinearSearch.find(arr, 3);
        assertEquals(2, result);
    }

    @Test
    public void testFindElementNotPresent() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = LinearSearch.find(arr, 6);
        assertEquals(-1, result);
    }

    @Test
    public void testFindEmptyArray() {
        int[] arr = {};
        int result = LinearSearch.find(arr, 1);
        assertEquals(-1, result);
    }

    @Test
    public void testFindSingleElementArray() {
        int[] arr = { 1 };
        int result = LinearSearch.find(arr, 1);
        assertEquals(0, result);
    }

    @Test
    public void testFindSingleElementArrayNotPresent() {
        int[] arr = { 1 };
        int result = LinearSearch.find(arr, 2);
        assertEquals(-1, result);
    }
}