public class BubbleSort {
    public static void bubbleSort(int[] lista) {
        int cont = 0; // Contador de operações
        int trocas = 0;

        boolean trocou; // Variável para verificar se houve trocas na iteração

        // Loop externo do Bubble Sort
        do {
            trocou = false; // Inicializa como falso antes de cada iteração
            for (int i = 0; i < lista.length - 1; i++) {
                cont++; // Incrementa o número de comparações
                if (lista[i] > lista[i+1]) { // Se o elemento atual for maior que o próximo, troca
                    int temp = lista[i+1];
                    lista[i+1] = lista[i];
                    lista[i] = temp;
                    trocou = true; // Marca que houve trocas
                    trocas++;
                }
            }
        } while (trocou); // Continua enquanto houver trocas

        // Exibe o array ordenado
//        for (int j : lista) {
//            System.out.print(j + " ");
//        }

        // Exibe estatísticas do algoritmo
        System.out.println("Tamanho do Array: " + lista.length);
        System.out.println("Operações: " + cont);
        System.out.println("Trocas: " + trocas);
    }
}
