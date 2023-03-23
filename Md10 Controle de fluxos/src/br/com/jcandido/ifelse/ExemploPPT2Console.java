package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploPPT2Console {
    public static void main (String args[]){


        System.out.println("qual o resultado");
        Scanner s = new Scanner(System.in);

        int result = s.nextInt();

        if (result > 1 && result < 5) {
            System.out.println("resultado está entre 1 e 5");
        } else if (result >= 5 && result < 8) {
            System.out.println("resultado está entre 5 e 8");
        } else {
            System.out.println("resultado diferente dos anteriores");
        }
    }
}
