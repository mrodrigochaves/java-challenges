package edu.mrodrigochaves.challenge.Exercicio02;

import java.io.Console;

public class PosicaoPalavras {

    public static void main(String[] args) {
        
        String texto = "micro-ondas";

        String[] retornoSplit = texto.split('-');

    
    Console.writeLine(String.format("Posição 0: {0} \nPosição 1: {1}", 
      retornoSplit[0], retornoSplit[1]));

    Console.readKey();
    }

    
}
