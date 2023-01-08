import java.util.Arrays;
import java.util.Random;

public class ZAD_4 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] genArr = generateArray(random, 10);
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println(equalsReverse(sortedArr, revArr)); // powinno wyświetlić true
    }

    public static int[] generateArray(Random random, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }

    public static boolean equalsReverse(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[arr2.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
