import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexStorageTest {

    @Test
    void size() {
        IndexStorage arr = new IndexStorage(10);
        assertEquals(10, arr.size());
    }

    @Test
    void get() {
        IndexStorage arr = new IndexStorage(10);
        assertEquals(-1, arr.get(1));
        assertEquals(2, arr.get(2));
    }

    @Test
    void reverse() {
        IndexStorage arr = new IndexStorage(10);
        int[] arrReverse = arr.reverse();
        assertEquals(-9, arrReverse[0]);
        assertEquals(0, arrReverse[9]);
    }

    @Test
    void reverseWhenSizeEqZero() {
        IndexStorage arr = new IndexStorage(0);
        assertThrows(IllegalArgumentException.class, ()-> arr.reverse());
    }
}