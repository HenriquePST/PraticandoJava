package br.com.jcandido.switchcase;

import java.util.Scanner;

public class ExemploScanner1 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("qual seu nome");
        String nome  = s.nextLine();

        System.out.println("qual sua altura");
        double altura = s.nextDouble();

        System.out.println( nome + "tem" + altura + "altura.");
    }
}
