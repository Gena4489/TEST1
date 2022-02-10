import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            System.out.println(arrayIndexStorage.get(i));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayIndexStorage.reverse()));
    }
}
