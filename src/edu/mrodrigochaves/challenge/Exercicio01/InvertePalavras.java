package edu.mrodrigochaves.challenge.Exercicio01;

import java.util.regex.Pattern;

/**
 * Inverte
 */

public class InvertePalavras {

    public static String invertePalavras(String frase) {
        // Dividir a string em palavras
        Pattern amostra = Pattern.compile("\\s");
        
        String[] palavras = amostra.split(frase);
        String resultado = "";

        // Concatenando palavras na variavel "resultado"
        for (int i = 0; i < palavras.length; i++) {
            if (i == palavras.length - 1)
                resultado = palavras[i] + resultado;
            else
                resultado = " " + palavras[i] + resultado;
        }
        return resultado;
    }

    // Invertendo ordem das palavras, adicionando CamelCase e ponto 
    public static void main(String[] args) {
        String s1 = "cachorro morde homem";
        System.out.println(invertePalavras(s1));
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        System.out.println(s1 + ".");

    }
}
