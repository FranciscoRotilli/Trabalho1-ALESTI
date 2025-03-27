import java.util.ArrayList;
import java.util.Arrays;

public class Evidencias {
    public static void main(String[] args) {
        long[] arr = {2836, 9787, 658, 26532, 68653, 265808, 567657, 4737673, 9069327, 80, 932858, 66532676, 693268657665L, 279866, 583653268, 2653};
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        ArrayList<Integer> list = splitIntoPairs(arr);
        System.out.println("Mensagem: " + toASCII(list));

    }
    public static String toASCII(ArrayList<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            int chave = arr.get(i);
            char ch = (char) chave;
            sb.append(ch);
        }
        return sb.toString();
    }
    public static ArrayList<Integer> splitIntoPairs(long[] arr) {
        StringBuilder sb = new StringBuilder();
        for (long number : arr) {
            sb.append(number);
        }
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < sb.length(); i+=2) {
            if (i + 1 < sb.length()) {
                String pair = sb.substring(i, i + 2);
                pairs.add(Integer.parseInt(pair));

            } else {
                String single = sb.substring(i);
                pairs.add(Integer.parseInt(single));
            }
        }
        return pairs;
    }
}
