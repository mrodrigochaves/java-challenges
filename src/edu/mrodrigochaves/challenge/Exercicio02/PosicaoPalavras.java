package edu.mrodrigochaves.challenge.Exercicio02;

public class PosicaoPalavras {

  public static String posicaoPenultimaPalavra( String frase) {
    //Retorna penultima palavra da string
    String[] palavras = frase.split(" ");
    if(palavras.length < 2 ){
      return " ";
    }
    return palavras[palavras.length - 2];
  }

  public static String posicaoPalavra(String frase, int n) {
    //Retorna a enésima palavra da string
    String[] palavras = frase.split(" ");
    if(n < 1 || n > palavras.length){
      return " ";
    }
    return palavras[ n - 1];
  }
    public static void main(String[] args) {
      //Recebe os métodos e imprime o resultado
      String s1 = "Eu sou um desenvolverdor Java";
      System.out.println(posicaoPenultimaPalavra(s1));

      s1 = "Eu posso programar com Java";
      int n = 2;
      System.out.println(posicaoPalavra(s1, n));
    }

    
}
