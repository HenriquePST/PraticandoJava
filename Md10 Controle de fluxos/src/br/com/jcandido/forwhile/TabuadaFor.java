package br.com.jcandido.forwhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabuadaFor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        System.out.println("digite um numero para gerar a tabuada");
        int num = s.nextInt();

        // For -> que usa contador e informa a qtd de registro que possui.
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + "=" + num * i);
        }
        // For -> que usa coleções e nao informar a qtd de registro que possui
        for (Integer i : a) {
            System.out.println(num + " X " + i + "=" + num * i);

        }
        // For -> mais aprimorado com a coleção de lambda.
        a.forEach(i->System.out.println(num + " X " + i + "=" + num * i) );
    }

}