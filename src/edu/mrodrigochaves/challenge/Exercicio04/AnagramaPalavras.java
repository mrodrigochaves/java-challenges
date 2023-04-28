package edu.mrodrigochaves.challenge.Exercicio04;


import java.util.Arrays;
import java.util.Scanner;

public class AnagramaPalavras {

    static boolean umAnagrama(String s1, String s2){
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        return Arrays.equals(s1Array, s2Array);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();
        
        boolean r1 = umAnagrama(s1,s2);
        System.out.println((r1 ? true : false));
    }
}