public class ZAD_2 {
    public static void main(String[] args) {
        int[] zakres = {5, 3, 7, 1, 4, 2, 6, -10, 0, -5};
        int[] sortedZakres = sortZakres(zakres);
        printZakres(sortedZakres);
    }

    public static int[] sortZakres(int[] zakres) {
        int[] sortedZakres = zakres.clone();

        for (int i = 0; i < sortedZakres.length - 1; i++) {
            for (int j = 0; j < sortedZakres.length - 1; j++) {
                if (sortedZakres[j] > sortedZakres[j + 1]) {
                    int temp = sortedZakres[j];
                    sortedZakres[j] = sortedZakres[j + 1];
                    sortedZakres[j + 1] = temp;
                }
            }
        }

        return sortedZakres;
    }

    public static void printZakres(int[] zakres) {
        for (int element : zakres) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
