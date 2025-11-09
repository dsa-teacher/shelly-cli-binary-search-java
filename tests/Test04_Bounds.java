import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test04_Bounds {
    @Test
    public void testBounds() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(0, BinarySearch.binarySearch(arr, 10), "Should find first element");
        assertEquals(4, BinarySearch.binarySearch(arr, 50), "Should find last element");
    }
    
    @Test
    public void testOutsideBounds() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5), "Should return -1 for value below range");
        assertEquals(-1, BinarySearch.binarySearch(arr, 55), "Should return -1 for value above range");
    }
}

