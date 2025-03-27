public class BubbleSort {
    public static void main(String[] args) {
        // Diferentes listas de entrada para teste
        //int[] lista = {3,1,0,8,4};
        //int[] lista = {3,4,0,8,1,12,78,14,2,7};
        //int[] lista = {0,8,2,3,4,5,6,7,1,9};
        int[] lista = {9,8,7,6,5,4,3,2,1}; // Lista desordenada

        int cont = 0; // Contador de operações
        int trocas = 0; // Contador de trocas de posição
        int repeticoes = 0; // Contador de iterações externas
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
                    trocas++; // Conta a troca realizada
                    trocou = true; // Marca que houve trocas
                }
            }
            repeticoes++; // Conta quantas vezes o loop externo foi executado
        } while (trocou); // Continua enquanto houver trocas

        // Exibe o array ordenado
        for (int j : lista) {
            System.out.print(j + " ");
        }

        // Exibe estatísticas do algoritmo
        System.out.println("\nOperações: " + cont);
        System.out.println("Trocas: " + trocas);
        System.out.println("Repetições: " + repeticoes);
    }
}
