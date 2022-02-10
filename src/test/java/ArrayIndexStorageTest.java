import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexStorageTest {

    @Test
    void get() {
        int[] arr = new int[10];
        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        assertEquals(-1, ais.get(1));
        assertEquals(2, ais.get(2));
    }
}