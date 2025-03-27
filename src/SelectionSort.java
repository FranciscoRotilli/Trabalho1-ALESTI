public class SelectionSort {
    public static void main(String[] args) {
        int[] entrada = {9, 8, 7, 6, 5, 4, 3, 2, 1}; // Lista desordenada

        int cont = 0; // Contador de comparações
        int trocas = 0; // Contador de trocas reais
        int repeticoes = 0; // Contador de iterações externas

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
                trocas++; // Incrementa apenas quando ocorre uma troca real
            }

            repeticoes++; // Conta a quantidade de iterações do loop externo
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
