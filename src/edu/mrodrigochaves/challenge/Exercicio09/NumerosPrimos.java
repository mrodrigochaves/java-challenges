package edu.mrodrigochaves.challenge.Exercicio09;

public class NumerosPrimos {
    public static boolean simPrimo( int numero) {
        //Loop verifica se um número é primo
        for(int i = 2; i < numero; i++){
            if(numero % i == 0)//se o número for divisível por algum outro número, não é primo
            return false;
        }
        return true;// se não for divisível por nenhum outro número, é primo
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {// verifica números de 2 até o numeor informado
            if( simPrimo(i) )
                System.out.println("Sim " + i + " é primo.");
        }        
    }
}
