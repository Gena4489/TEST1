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

    @Test
    void getWhenSizeEqZero() {
        int[] arr = new int[0];
        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        assertThrows(IndexOutOfBoundsException.class, ()-> ais.get(1));
    }

    @Test
    void getWhenIndexGtSize() {
        int[] arr = new int[10];
        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        assertThrows(IndexOutOfBoundsException.class, ()-> ais.get(11));
    }

    @Test
    void getWhenIndexLtSize() {
        int[] arr = new int[10];
        ArrayIndexStorage ais = new ArrayIndexStorage(arr);
        assertThrows(IndexOutOfBoundsException.class, ()-> ais.get(-1));
    }
}