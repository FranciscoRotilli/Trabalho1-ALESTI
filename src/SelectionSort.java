public class SelectionSort {
    public static void main(String[] args) {
        int[] entrada = {9, 8, 7, 6, 5, 4, 3, 2, 1}; // Array de entrada desordenado

        int cont = 0; // Contador de operações
        int trocas = 0; // Contador de trocas de posição
        int repeticoes = 0; // Contador de iterações externas

        // Percorre o array para encontrar o menor elemento e colocá-lo na posição correta
        for (int i = 0; i < entrada.length; i++) {
            int menor = i; // Assume que o menor elemento está na posição atual

            // Percorre o restante do array para encontrar um valor menor
            for (int j = i + 1; j < entrada.length; j++) {
                cont++; // Incrementa o número de comparações
                if (entrada[j] < entrada[menor]) {
                    menor = j; // Atualiza a posição do menor valor encontrado
                    trocas++; // Conta quantas vezes um novo menor valor foi encontrado
                }
            }
            // Troca o menor elemento encontrado com o elemento da posição atual
            int aux = entrada[menor];
            entrada[menor] = entrada[i];
            entrada[i] = aux;

            repeticoes++; // Conta quantas vezes o loop externo foi executado
        }

        // Exibe estatísticas do algoritmo
        System.out.println("\nOperações: " + cont);
        System.out.println("Trocas: " + trocas);
        System.out.println("Repetições: " + repeticoes);

        // Exibe o array ordenado
        for (int j : entrada) {
            System.out.print(j + " ");
        }
    }
}
