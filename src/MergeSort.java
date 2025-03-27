import java.util.Arrays;

public class MergeSort {
    // Metodo principal do Merge Sort
    void mergeSort(long[] arr, int n) {
        if (n < 2) // Se o array tem menos de 2 elementos, já está ordenado, termina a funçao.
            return;

        int mid = n/2; // Calcula e armazena o index do meio do array
        long[] left = new long[mid]; // Cria um array para armazenar a primeira metade
        long[] right = new long[n-mid]; // Cria um array para armazenar a segunda metade

        // Copia os elementos da primeira metade do array original para o array 'left'
        for (int i=0; i<mid; i++) {
            left[i] = arr[i];
        }
        // Copia os elementos da segunda metade do array original para o array 'right'
        for (int i=mid; i<n; i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left, mid); // Execute recursivamente a função na primeira parte do novo array
        mergeSort(right, n-mid); // Execute recursivamente a função na segunda parte do novo array

        merge(arr, left, right, mid, n-mid); // Junta as duas partes do array recursivamente
    }

    // Metodo responsável por mesclar os dois subarrays ordenados
    void merge(long[] arr, long[] l, long[] r, int left, int right) {
        int i = 0, j = 0, k = 0; // Índices para percorrer os subarrays e o array original

        // Compara elementos de ambos os subarrays e os adiciona ao array original em ordem
        while (i < left && j < right) {
            if(l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        // Copia os elementos restantes do subarray 'l' (se houver)
        while (i < left) {
            arr[k++] = l[i++];
        }
        // Copia os elementos restantes do subarray 'r' (se houver)
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
    // Metodo principal para executar o algoritmo
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        long[] arr = {10, 7, 8, 9, 1, 5, 3, 6, 4, 2};
        ms.mergeSort(arr, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
