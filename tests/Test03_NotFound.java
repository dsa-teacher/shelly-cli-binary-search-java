import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test03_NotFound {
    @Test
    public void testNotFound() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, BinarySearch.binarySearch(arr, 2), "Should return -1 for 2");
        assertEquals(-1, BinarySearch.binarySearch(arr, 6), "Should return -1 for 6");
        assertEquals(-1, BinarySearch.binarySearch(arr, 14), "Should return -1 for 14");
    }
    
    @Test
    public void testSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, BinarySearch.binarySearch(arr, 3), "Should return -1 for non-matching element");
    }
}

