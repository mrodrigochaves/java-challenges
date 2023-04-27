package edu.mrodrigochaves.challenge.Exercicio03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaPalavras{

    public static void main(String[] args) {
        
        String entrada = "Olá mundo, eu sou do mundo!";
        String palavra = "mundo";
        boolean contem = entrada.contains("mundo");

        // Inicializa o contador de ocorrências
        int contador = 0;

         // Compila um padrão de busca que inclui a palavra procurada delimitada pelos caracteres de borda '\b'
        Pattern amostra = Pattern.compile("\\b" + palavra + "\\b");
        // Procura todas as ocorrências da palavra na entrada
        Matcher matcher = amostra.matcher(entrada);

         // Enquanto houver ocorrências da palavra na entrada, incrementa o contador
        while(matcher.find()){
            contador++;
        }
                
        // Imprime true ou false 
        System.out.println(contem);        
        System.out.println(palavra.contains("world"));

        
        // Imprime o número total de ocorrências da palavra na tela
        System.out.println("A palavra '" + palavra + "' aparece " + contador + " veze(s) na entrada.");


}

}