package edu.mrodrigochaves.challenge.Exercicio08;

public class MaxProduto {

    // Método que calcula o produto máximo em um subarray dado um array de inteiros
    static int subArrayMaxProduto(int arr[]) {

        int resultado = arr[0];
        int n = arr.length;

        // Loop externo que percorre todos os elementos do array
        for (int i = 0; i < n; i++) {
            int elemento = arr[i];

            // Loop interno que percorre os elementos do subarray
            for (int x = i + 1; x < n; x++) {
                resultado = Math.max(resultado, elemento);
                elemento *= arr[x];
            }
            resultado = Math.max(resultado, elemento);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        
        // Impressão do resultado na tela
        System.out.println("O produto máximo é: " + subArrayMaxProduto(arr));
    }

}
