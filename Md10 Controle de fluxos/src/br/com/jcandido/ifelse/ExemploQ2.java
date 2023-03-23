package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploQ2 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);

        System.out.println(" informe o ano nascimento ");
        int anoNasc = a.nextInt();

        System.out.println(" informe o ano atual ");
        int anoAtual = a.nextInt();

        int result = anoAtual - anoNasc;
        System.out.println("sua idade é " + result + " anos.");

        if (result >= 16){
            System.out.println("eleitor podera votar.");
        } else if (result < 16) {
            System.out.println("eleitor nao podera votar.");
        }
    }
}
