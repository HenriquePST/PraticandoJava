package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploQ3 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("informe sua senha");
        int senha = s.nextInt();

        int senhaD = 1234;

        if (senha == senhaD){
            System.out.println("ACESSO PERMITIDO caso a senha seja válida.");
        }else if (senha != senhaD){
            System.out.println("ACESSO NEGADO caso a senha seja inválida. ");
        }    }
}
