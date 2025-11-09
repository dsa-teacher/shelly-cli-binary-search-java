import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test02_FoundIndex {
    @Test
    public void testFoundIndex() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(0, BinarySearch.binarySearch(arr, 1), "Should find 1 at index 0");
        assertEquals(3, BinarySearch.binarySearch(arr, 7), "Should find 7 at index 3");
        assertEquals(6, BinarySearch.binarySearch(arr, 13), "Should find 13 at index 6");
    }
    
    @Test
    public void testSingleElement() {
        int[] arr = {5};
        assertEquals(0, BinarySearch.binarySearch(arr, 5), "Should find element at index 0");
    }
}

