package edu.mrodrigochaves.challenge.Exercicio06;

import java.text.DecimalFormat;

public class Inversao {

    private static final DecimalFormat df = new DecimalFormat("#0.00");
 
    public static void main(String[] args) {


        // Declaração de uma variável inteira para ser invertida
		double paraInverter = 473.85; 

        // Transforma a variável em uma string
		String numDigitos = Double.toString(paraInverter); 

        // Declaração de uma string vazia que armazenará o número invertido
		String armazena = ""; 
		
         // Loop for que percorre a string de trás para frente
		for (int i=numDigitos.length(); i > 0; i--) {

            // Adiciona cada caractere à variável c na ordem inversa
			armazena += numDigitos.substring(i - 1, i);
		}
		
         // Imprime o número invertido na tela
		System.out.println("Este é o número invertido: " + armazena );

        // Imprime o número invertido na tela com duas casas decimais
        System.out.println("Este é o número invertido com duas casas decimais: " + df.format(Double.parseDouble(armazena)));
           
	}

}