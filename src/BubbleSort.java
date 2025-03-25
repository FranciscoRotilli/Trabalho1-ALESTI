public class BubbleSort {
    public static void main(String[] args) {
        //int[] lista = {3,1,0,8,4};
        //int[] lista = {3,4,0,8,1,12,78,14,2,7};
        //int[] lista = {0,8,2,3,4,5,6,7,1,9};
        int[] lista = {9,8,7,6,5,4,3,2,1};

        int cont = 0;
        int trocas = 0;
        int repeticoes = 0;
        while (!isOrdered(lista)) {
            for (int i = 0; i < lista.length - 1; i++) {
                cont++;
                if (lista[i] > lista[i+1]) {
                    int temp = lista[i+1];
                    lista[i+1] = lista[i];
                    lista[i] = temp;
                    trocas++;
                }
            }
            repeticoes++;
        }
        for (int j : lista) {
            System.out.print(j + " ");
        }
        System.out.println("\nOperações: " + cont);
        System.out.println("Trocas: " + trocas);
        System.out.println("Repetições: " + repeticoes);
    }
    public static boolean isOrdered(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i+1]) {
                return false;
            }
        }
        return true;
    }
}
