package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploQ1 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1 = n.nextInt();

        System.out.println("digite segundo número");
        int n2 = n.nextInt();


        if (n1 == n2) {
            System.out.println("numeros iguais");
        } else if (n1 > n2) {
            System.out.println("o primeiro numero é maior");
        } else if (n2 > n1) {
            System.out.println("o segundo numero é maior");
        }
    }
}
