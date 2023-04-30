package edu.mrodrigochaves.challenge.Exercicio06;

public class Inversao {
 
    public static void main(String[] args) {
        // Declaração de uma variável inteira para ser invertida
		Integer paraInverter = 4785; 

        // Transforma a variável em uma string
		String numDigitos = paraInverter.toString(); 

        // Declaração de uma string vazia que armazenará o número invertido
		String armazena = ""; 
		
         // Loop for que percorre a string de trás para frente
		for (int i=numDigitos.length(); i > 0; i--) {

            // Adiciona cada caractere à variável c na ordem inversa
			armazena += numDigitos.substring(i - 1, i);
		}
		
         // Imprime o número invertido na tela
		System.out.println("Este é o número invertido: " + armazena);
	}

}