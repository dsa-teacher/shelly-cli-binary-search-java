import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test01_EmptyArray {
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5), "Should return -1 for empty array");
    }
}

