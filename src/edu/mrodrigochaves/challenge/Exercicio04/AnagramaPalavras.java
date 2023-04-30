package edu.mrodrigochaves.challenge.Exercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramaPalavras {

    // função que verifica se duas strings são anagramas
    static boolean saoAnagramas(String s1, String s2) {
        // converte as strings para char arrays e coloca em caixa baixa para
        // padronização
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();

        // ordena os char arrays em ordem alfabética
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // verifica se os dois char arrays são iguais, ou seja, se as strings são
        // anagramas
        return Arrays.equals(s1Array, s2Array);
    }

    // função que agrupa as strings em listas de anagramas
    public static List<List<String>> agruparAnagramas(String[] strings) {
        // cria um HashMap para armazenar as strings anagramas agrupadas
        Map<String, List<String>> anagramas = new HashMap<>();

        // percorre a lista de strings
        for (String s : strings) {
            // converte a string para um char array e ordena em ordem alfabética
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // cria uma chave para o HashMap a partir do char array ordenado
            String chave = new String(chars);
            // verifica se a chave já existe no HashMap
            if (anagramas.containsKey(chave)) {
                // se existir, adiciona a string atual na lista correspondente
                anagramas.get(chave).add(s);
            } else {
                // se não existir, cria uma nova lista para essa chave e adiciona a string atual
                List<String> lista = new ArrayList<>();
                lista.add(s);
                anagramas.put(chave, lista);
            }
        }
        // retorna uma lista com todas as listas de anagramas encontradas
        return new ArrayList<>(anagramas.values());
    }
    // função principal
    public static void main(String[] args) {
        // verifica se duas strings são anagramas
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(saoAnagramas(s1, s2));

        // agrupa as strings em listas de anagramas
        String[] strings = { "tar", "rat", "art", "meats", "steam" };
        List<List<String>> grupos = agruparAnagramas(strings);
        System.out.println(grupos);
    }

}