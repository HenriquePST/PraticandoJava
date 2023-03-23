package br.com.jcandido.switchcase;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("digite sua idade");
        int idade = s.nextInt();
        System.out.println("Sua idade é" + idade + " anos.");

        if ( idade > 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}
