package edu.mrodrigochaves.challenge.SegundoDesafio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler os dados de entrada
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Lê a quantidade de números que serão lidos
        double valor = scan.nextDouble();

        
        // Notas
        int notas100 = (int) (valor / 100);
        valor %= 100;
        int notas50 = (int) (valor / 50);
        valor %= 50;
        int notas20 = (int) (valor / 20);
        valor %= 20;
        int notas10 = (int) (valor / 10);
        valor %= 10;
        int notas5 = (int) (valor / 5);
        valor %= 5;
        int notas2 = (int) (valor / 2);
        valor %= 2;

        // Moedas
        int moedas1 = (int) (valor / 1);
        valor %= 1;
        int moedas50 = (int) (valor / 0.5);
        valor %= 0.5;
        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        int moedas10 = (int) (valor / 0.1);
        valor %= 0.1;
        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        int moedas1Cent = (int) (valor / 0.01);


        // Imprime o resultado final com as notas e moedas
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas1Cent + " moeda(s) de R$ 0.01");

        // Fecha o objeto Scanner
        scan.close();
    }
}
