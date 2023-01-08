import java.util.Random;
//Utwórz metodę, która pobiera liczbę całkowitą n, tworzy tablicę typów całkowitych z nelementami,
// definiuje ją za pomocą losowych liczb całkowitych od 0 do 100 i zwracawygenerowaną tablicę.
// Następnie utwórz metodę, która jako parametr pobiera tablicę liczbcałkowitych i wyświetla ją w konsoli.

public class ZAD_1_withN {

    public static void main(String[] args) {
        int[] ZAKRES = createZAKRES(10);
        printZAKRES(ZAKRES);
    }

    public static int[] createZAKRES(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void printZAKRES(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

