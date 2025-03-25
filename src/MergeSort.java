import java.util.Arrays;

public class MergeSort {
    void mergeSort(int[] arr, int n) {
        if (n < 2)
            return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i=0; i<mid; i++) {
            left[i] = arr[i];
        }
        for (int i=mid; i<n; i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left, mid);
        mergeSort(right, n-mid);

        merge(arr, left, right, mid, n-mid);
    }
    void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if(l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = { 5, 1, 6, 2, 3, 4 };
        ms.mergeSort(arr, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
