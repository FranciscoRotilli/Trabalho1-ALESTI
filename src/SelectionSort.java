public class SelectionSort {
    public static void selectionSort(int[] entrada) {
        int cont = 0; // Contador de comparações
        int trocas = 0;

        for (int i = 0; i < entrada.length - 1; i++) {
            int menor = i; // Assume que o menor elemento está na posição atual
            for (int j = i + 1; j < entrada.length; j++) {
                cont++; // Incrementa o número de comparações
                if (entrada[j] < entrada[menor]) {
                    menor = j; // Atualiza a posição do menor valor encontrado
                }
            }

            // Faz a troca apenas se o menor valor for diferente da posição inicial
            if (menor != i) {
                int aux = entrada[menor];
                entrada[menor] = entrada[i];
                entrada[i] = aux;
                trocas++;
            }
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
