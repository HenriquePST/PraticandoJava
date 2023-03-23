package br.com.jcandido.ifelse;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal : ");
        String nome = s.next();


        String animal = exemploIF(nome);
        System.out.println(animal);

    }

    public static String exemploIF(String animal) {
        String result;

        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("tiger")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
