package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("qual sua idade");
        int idade = s.nextInt();

        // pegando o meto criado, e declando main

        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idadeSt) {

        int idade = 0;
        
        if (idade >= 0 && idade <= 5) {
            return  "você é um bebê";
        } else if (idade >= 6 && idade <= 10) {
            return  "você é um criança";
        } else if (idade >= 11 && idade <= 18) {
            return  "você é um adolescente";
        } else {
            return "voê é adulto";
        }
    }
}




