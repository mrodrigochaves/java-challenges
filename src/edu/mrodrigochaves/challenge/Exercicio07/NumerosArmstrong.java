package edu.mrodrigochaves.challenge.Exercicio07;

public class NumerosArmstrong {
    public static void main(String[] args) {

        int entradaNumero;

        //Loop para testar números de 1 a 1000
        for (int i = 1; i <= 1000; i++) {
            entradaNumero = 0;

             //Converte o número em string para manipulação
            String convertido = String.valueOf(i);

             //Loop para obter cada dígito do número e elevar ao cubo
            for (int x = 0; x < convertido.length(); x++) {
                String y = String.valueOf(convertido.charAt(x));
                int e = Integer.parseInt(y);
                entradaNumero += Math.pow(e, 3);
            }

              //Compara se a soma dos dígitos elevados ao cubo é igual ao número original
            if (entradaNumero == i)
                System.out.println("É um número Armstrong: " + i);
        }

    }

}
