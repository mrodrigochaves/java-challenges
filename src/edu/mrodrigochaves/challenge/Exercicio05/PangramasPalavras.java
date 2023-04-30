package edu.mrodrigochaves.challenge.Exercicio05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PangramasPalavras {

    public static void main(String[] args) {
        // Define a frase a ser verificada
        String frase = "Mr. Jock, TV quiz Ph.D., bags few lynx.";

        // Verifica se a frase é um pangrama e imprime na tela
        System.out.println("A frase '" + frase + "' é um pangrama? " + umPangrama(frase));

        // Verifica se a frase é um pangrama perfeito e imprime na tela
        System.out.printf("O conjunto '%s' é pangrama perfeito? %b\n", frase, umPangramaPerfeito(frase));
    }

    // Método que verifica se a frase é um pangrama
    public static boolean umPangrama(String palavra) {
        palavra = palavra.toUpperCase(); // Converte a frase para maiúscula
        char[] arrayAlfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // Cria um array com as letras do alfabeto

        // Percorre a frase e marca as letras do alfabeto encontradas
        for (char letra : palavra.toCharArray()) {
            for (int i = 0; i < arrayAlfabeto.length; i++) {
                if (letra == arrayAlfabeto[i]) {
                    arrayAlfabeto[i] = ' '; // Marca a letra como encontrada
                    break;
                }
            }
        }

        // Verifica se todas as letras do alfabeto foram encontradas
        return Arrays.equals(arrayAlfabeto, "                          ".toCharArray());
    }

    // Método que verifica se a frase é um pangrama perfeito
    public static boolean umPangramaPerfeito(String letras) {
        if (letras == null) { // Verifica se a string é nula
            return false;
        }
        letras = letras.toUpperCase(); // Converte a string para maiúscula
        Map<Character, Integer> freqMap = new HashMap<>(); // Cria um mapa para armazenar a frequência de cada letra
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            freqMap.put(ch, 0); // Inicializa o mapa com frequência zero para cada letra do alfabeto
        }
        for (int i = 0; i < letras.length(); i++) { // Percorre a string e atualiza as frequências no mapa
            char ch = letras.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                freqMap.put(ch, freqMap.get(ch) + 1); // Incrementa a frequência da letra encontrada
            }
        }
        for (int freq : freqMap.values()) { // Verifica se todas as frequências são iguais a 1
            if (freq != 1) {
                return false; // Caso contrário, retorna false
            }
        }
        return true; // Se todas as frequências são iguais a 1, retorna true
    }
}
