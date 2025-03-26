public class InsertionSort {
    // Método que implementa o algoritmo de Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        // Percorre o array a partir do segundo elemento
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Elemento a ser inserido na parte ordenada
            int j = i - 1;

            // Move os elementos do array[0..i-1] que são maiores que key
            // uma posição à frente de sua posição atual
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Desloca o elemento para frente
                j = j - 1;
            }
            // Insere 'key' na posição correta dentro da parte ordenada do array
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6}; // Array de exemplo
        System.out.println("Array antes da ordenação:");
        printArray(array); // Exibe o array antes da ordenação

        insertionSort(array); // Chama o metodo de ordenação

        System.out.println("Array após a ordenação:");
        printArray(array); // Exibe o array após a ordenação
    }

    // Metodo auxiliar para imprimir o array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}