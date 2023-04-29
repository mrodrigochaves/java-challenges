package edu.mrodrigochaves.challenge.Exercicio05;


public class Pangramas {

    public static void main(String[] args) {
        // Declaração de uma string que representa uma frase
        String[] frase = {"Mr. Jock, TV quiz Ph.D., bags few lynx."};
        
        // Loop para percorrer a frase
        for (String palavra : frase) {
             // Impressão na tela da frase e se ela é ou não um pangrama, usando o método umPangrama
            System.out.printf("O conjunto '%s' é pangrama? %b\n", palavra, umPangrama(palavra));
        }
    }

    // Método que verifica se a frase é um pangrama
    public static boolean umPangrama(String palavra) {
        palavra = palavra.toUpperCase();
        boolean[] arrayAlfabeto = new boolean[26]; // criando um array booleano para representar o alfabeto
        int index;
        
        // percorrer a string e marcar os caracteres encontrados no alfabeto como true
        for (int i = 0; i < palavra.length(); i++) {
            char caracteres = palavra.charAt(i);
            if (caracteres >= 'A' && caracteres <= 'Z') {
                index = caracteres - 'A'; // obter o índice do caractere no alfabeto
                arrayAlfabeto[index] = true;
            }
        }
        
        // verificar se todos os caracteres do alfabeto foram encontrados
        for (boolean temTodos : arrayAlfabeto) {
            if (!temTodos) {
                return false;
            }
        }
        
        return true;
    }

}
