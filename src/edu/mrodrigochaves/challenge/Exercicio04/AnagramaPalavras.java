package edu.mrodrigochaves.challenge.Exercicio04;


import java.util.Arrays;

public class AnagramaPalavras {

    // função que verifica se duas strings são anagramas
    static boolean umAnagrama(String s1, String s2){
         // converte as strings para char arrays e coloca em caixa baixa para padronização
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        
        // ordena os char arrays em ordem alfabética
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        return Arrays.equals(s1Array, s2Array);
    }
    public static void main(String[] args) {
        // verifica se duas strings são anagramas
        String s1 = "ola";
        String s2 = "alo";
        
        boolean r1 = umAnagrama(s1,s2);
        System.out.println((r1 ? true : false));
    }
}