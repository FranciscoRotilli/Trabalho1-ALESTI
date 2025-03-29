public class InsertionSort {
    public static void insertionSort(int[] entrada) {
        int cont = 0; // Contador de operações
        int trocas = 0; // Contador de trocas

        for (int i = 1; i < entrada.length; i++) {
            int chave = entrada[i]; // Elemento a ser inserido na posição correta
            int j = i - 1;

            // Move os elementos maiores que a chave uma posição à frente
            while (j >= 0) {
                cont++; // Conta cada comparação feita

                if (entrada[j] > chave) {
                    entrada[j + 1] = entrada[j];
                    j--;
                    trocas++;
                } else {
                    break; // Sai do while assim que encontrar um elemento menor ou igual
                }
            }

            entrada[j + 1] = chave; // Insere o elemento na posição correta
        }

        // Exibe o array ordenado
//        for (int j : entrada) {
//            System.out.print(j + " ");
//        }

        // Exibe estatísticas do algoritmo
        System.out.println("Tamanho do Array: " + entrada.length);
        System.out.println("Operações: " + cont);
        System.out.println("Trocas: " + trocas);
    }
}
