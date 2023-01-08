public class ZAD_3 {
    public static void main(String[] args) {
        int[] zakres = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedZakres;
        reversedZakres = reverseZakres(zakres);
        printZakres(reversedZakres);
    }

    public static int[] reverseZakres(int[] zakres) {
        int[] reversedZakres = new int[zakres.length];

        for (int i = 0; i < zakres.length; i++) {
            reversedZakres[i] = zakres[zakres.length - 1 - i];
        }

        return reversedZakres;
    }

    public static void printZakres(int[] zakres) {
        for (int element : zakres) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
