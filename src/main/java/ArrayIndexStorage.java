public class ArrayIndexStorage extends IndexStorage {
    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
        for (int i = 0; i < size(); i++) {
            arr[i] = super.get(i);
        }
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Индекс вне пределов массива");
        }
        return arr[index];
    }
}
