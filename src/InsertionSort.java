public class InsertionSort {
    public static void main(String[] args) {
        int[] entrada = {9, 8, 7, 6, 5, 4, 3, 2, 1}; // Lista desordenada

        int cont = 0; // Contador de comparações
        int trocas = 0; // Contador de trocas reais
        int repeticoes = 0; // Contador de iterações externas

        for (int i = 1; i < entrada.length; i++) {
            int chave = entrada[i]; // Elemento a ser inserido na posição correta
            int j = i - 1;

            // Move os elementos maiores que a chave uma posição à frente
            while (j >= 0 && entrada[j] > chave) {
                entrada[j + 1] = entrada[j];
                j--;
                cont++; // Contabiliza a comparação dentro do while
                trocas++; // Contabiliza a movimentação de elementos
            }
            entrada[j + 1] = chave; // Insere o elemento na posição correta
            repeticoes++; // Conta as iterações do laço externo
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
