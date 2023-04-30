package edu.mrodrigochaves.challenge.Exercicio10;

public class FatoresPrimos {

    // Método que imprime os fatores primos de um número n
    public static void primos(int n) {

        // Enquanto n for divisível por 2, imprime 2 como um fator primo e divide n por
        // 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Percorre os números ímpares a partir de 3 até a raiz quadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            // Enquanto n for divisível por i, imprime i como um fator primo e divide n por
            // i
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // Se n é maior que 2, ele próprio é um fator primo
        if (n > 2)
            System.out.print(n);
    }

    // Método main que chama o método primos com o número 315
    public static void main(String[] args) {
        int n = 315;
        primos(n);
    }
}