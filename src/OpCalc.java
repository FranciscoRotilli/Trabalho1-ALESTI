public class OpCalc {
    public static void main(String[] args) {
        int[] entrada10 = {2, 3, 7, 1, 11, 5, 4, 8, 9, 6};
        int[] entrada20 = {5, 12, 8, 21, 33, 7, 14, 19, 42, 3, 27, 9, 16, 25, 38, 11, 29, 6, 31, 240};
        int[] entrada30 = {7, 15, 22, 34, 11, 28, 9, 17, 41, 5, 26, 13, 32, 19, 8, 27, 14, 39, 3, 21,
                30, 6, 18, 45, 12, 25, 36, 10, 29, 4};
        int[] entrada40 = {3, 17, 25, 8, 12, 30, 41, 6, 14, 22, 33, 19, 5, 28, 9, 36, 11, 44, 7, 23,
                39, 15, 32, 2, 26, 10, 37, 4, 20, 45, 13, 29, 18, 42, 16, 34, 27, 31, 24, 40};
        int[] entrada50 = {5, 12, 28, 33, 7, 19, 42, 3, 27, 9, 16, 25, 38, 11, 29, 6, 31, 24, 8, 14,
                21, 36, 44, 18, 41, 22, 13, 37, 4, 30, 15, 48, 20, 39, 10, 26, 45, 23, 34, 32,
                17, 50, 1, 46, 40, 35, 43, 2, 47, 49};
        int[] entrada60 = {7, 72, 41, 39, 62, 68, 33, 18, 26, 23, 8, 56, 65, 74, 1, 70, 58, 25, 31, 55,
                59, 45, 64, 21, 57, 48, 60, 46, 71, 73, 94, 76, 84, 66, 32, 36, 81, 98, 82, 28,
                34, 29, 47, 100, 79, 50, 85, 6, 96, 40, 43, 75, 49, 11, 87, 86, 5, 78, 77, 3};
        System.out.println("==================================");
        System.out.println("=========== BUBBLE SORT ==========");
        System.out.println("==================================");
        BubbleSort.bubbleSort(entrada10.clone());
        BubbleSort.bubbleSort(entrada20.clone());
        BubbleSort.bubbleSort(entrada30.clone());
        BubbleSort.bubbleSort(entrada40.clone());
        BubbleSort.bubbleSort(entrada50.clone());
        BubbleSort.bubbleSort(entrada60.clone());
        System.out.println("==================================");
        System.out.println("========= SELECTION SORT =========");
        System.out.println("==================================");
        SelectionSort.selectionSort(entrada10.clone());
        SelectionSort.selectionSort(entrada20.clone());
        SelectionSort.selectionSort(entrada30.clone());
        SelectionSort.selectionSort(entrada40.clone());
        SelectionSort.selectionSort(entrada50.clone());
        SelectionSort.selectionSort(entrada60.clone());
        System.out.println("=================================");
        System.out.println("========= INSERTION SORT ========");
        System.out.println("=================================");
        InsertionSort.insertionSort(entrada10.clone());
        InsertionSort.insertionSort(entrada20.clone());
        InsertionSort.insertionSort(entrada30.clone());
        InsertionSort.insertionSort(entrada40.clone());
        InsertionSort.insertionSort(entrada50.clone());
        InsertionSort.insertionSort(entrada60.clone());
    }
}
