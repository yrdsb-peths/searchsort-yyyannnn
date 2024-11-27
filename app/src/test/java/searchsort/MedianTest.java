package searchsort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedianTest {
    private final Median median = new Median();

    @Test
    public void testFindQuick() {
        int[] input = { 5, 2, 9, 1, 5, 6 };
        double expected = 5.0;
        assertEquals(expected, median.findQuick(input), 0.001);
    }

    @Test
    public void testFindMerge() {
        int[] input = { 5, 2, 9, 1, 5, 6 };
        double expected = 5.0;
        assertEquals(expected, median.findMerge(input), 0.001);
    }

    @Test
    public void testFindInsertion() {
        int[] input = { 5, 2, 9, 1, 5, 6 };
        double expected = 5.0;
        assertEquals(expected, median.findInsertion(input), 0.001);
    }

    @Test
    public void testFindQuick_EmptyArray() {
        int[] input = {};
        double expected = 0.0;
        assertEquals(expected, median.findQuick(input), 0.001);
    }

    @Test
    public void testFindMerge_EmptyArray() {
        int[] input = {};
        double expected = 0.0;
        assertEquals(expected, median.findMerge(input), 0.001);
    }

    @Test
    public void testFindInsertion_EmptyArray() {
        int[] input = {};
        double expected = 0.0;
        assertEquals(expected, median.findInsertion(input), 0.001);
    }

    @Test
    public void testFindQuick_SingleElement() {
        int[] input = { 3 };
        double expected = 3.0;
        assertEquals(expected, median.findQuick(input), 0.001);
    }

    @Test
    public void testFindMerge_SingleElement() {
        int[] input = { 3 };
        double expected = 3.0;
        assertEquals(expected, median.findMerge(input), 0.001);
    }

    @Test
    public void testFindInsertion_SingleElement() {
        int[] input = { 3 };
        double expected = 3.0;
        assertEquals(expected, median.findInsertion(input), 0.001);
    }
}