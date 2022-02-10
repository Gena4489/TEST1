public class IndexStorage {
    private final int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return index % 2 == 0 ? index : -index;
    }

    public int[] reverse() {
        if (size > 0) {
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[size - i - 1] = get(i);
            }
            return arr;
        }
        throw new IllegalArgumentException("Размер массива не задан");
    }
}
