import java.util.Arrays;

public class QuickSort {
    int medianOfThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        // Ordenar os três valores manualmente
        if (arr[mid] < arr[low]) swap(arr, low, mid);
        if (arr[high] < arr[low]) swap(arr, low, high);
        if (arr[high] < arr[mid]) swap(arr, mid, high);

        // O elemento do meio agora é a mediana, então colocamos ele no final como pivô
        swap(arr, mid, high);
        return arr[high]; // Retorna o pivô (que agora está na posição 'high')
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int part(int arr[], int low, int high) {
        int pivot = medianOfThree(arr, low, high); // Usa a mediana de três como pivô
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Coloca o pivô na posição correta

        return i + 1; // Retorna a posição do pivô
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = part(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5, 3, 6, 4, 2};

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
