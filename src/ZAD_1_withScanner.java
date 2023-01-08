import java.util.Random;
import java.util.Scanner;

//Utwórz metodę, która pobiera liczbę całkowitą n, tworzy tablicę typów całkowitych z nelementami,
// definiuje ją za pomocą losowych liczb całkowitych od 0 do 100 i zwracawygenerowaną tablicę.
// Następnie utwórz metodę, która jako parametr pobiera tablicę liczbcałkowitych i wyświetla ją w konsoli.
// Wersja ze Scannerem

public class ZAD_1_withScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe elementow tablicy: ");
        int n = scanner.nextInt();

        int[] ZAKRES = createZAKRES(n);
        printZAKRES(ZAKRES);
    }

    public static int[] createZAKRES(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    public static void printZAKRES(int[] ZAKRES) {
        for (int zakres : ZAKRES) {
            System.out.print(zakres + " ");
        }
        System.out.println();
    }
}
