import java.util.Arrays;

public class QuickSort {
    // Metodo para calcular a mediana de três valores e usá-la como pivô
    int medianOfThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        // Ordena manualmente os três valores para encontrar a mediana
        if (arr[mid] < arr[low]) swap(arr, low, mid); // Garante que o menor valor esteja na posição 'low'
        if (arr[high] < arr[low]) swap(arr, low, high); // Garante que o maior valor esteja na posição 'high'
        if (arr[high] < arr[mid]) swap(arr, mid, high); // Garante que o valor médio esteja na posição 'mid'

        // Move a mediana para a posição 'high' para ser usada como pivô
        swap(arr, mid, high);
        return arr[high]; // Retorna o pivô
    }

    // Metodo para trocar elementos em um array
    void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // Armazena temporariamente o valor na posição 'i'
        arr[i] = arr[j]; // Move o valor na posição 'j' para 'i'
        arr[j] = temp; // Move o valor armazenado temporariamente para 'j'
    }

    // Metodo que particiona o array em relação ao pivô
    int part(int[] arr, int low, int high) {
        int pivot = medianOfThree(arr, low, high); // Determina o pivô usando a mediana de três
        int i = low - 1; // Inicializa o índice para elementos menores que o pivô

        // Percorre o array e organiza os elementos em relação ao pivô
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) { // Se o elemento atual é menor ou igual ao pivô
                i++; // Incrementa o índice
                swap(arr, i, j); // Troca os elementos para manter a ordem
            }
        }
        swap(arr, i + 1, high); // Coloca o pivô na posição correta
        return i + 1; // Retorna a posição do pivô
    }

    // Metodo principal do QuickSort que realiza a ordenação recursiva
    void sort(int[] arr, int low, int high) {
        if (low < high) { // Verifica se há mais de um elemento para ordenar
            int pi = part(arr, low, high); // Particiona o array e obtém a posição do pivô

            sort(arr, low, pi - 1); // Ordena recursivamente a parte à esquerda do pivô
            sort(arr, pi + 1, high); // Ordena recursivamente a parte à direita do pivô
        }
    }

    // Metodo principal para executar o algoritmo
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5, 3, 6, 4, 2};
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
