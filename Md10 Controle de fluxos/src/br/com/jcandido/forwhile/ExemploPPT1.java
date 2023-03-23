package br.com.jcandido.forwhile;


import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {
    public static void main(String args[]){
        List<Integer> valores = new ArrayList<>();


        // For -> que usa contador e informa a qtd de registro que possui.
        for (int i = 0; i <= 10; i++){
            System.out.println("Linha"+i);
            valores.add(i);
        }

        // For -> que usa coleções e nao informar a qtd de registro que possui.
        for (Integer i : valores) {
            System.out.println("linha"+i);
        }
        // For -> mais aprimorado com a coleção de lambda.
        valores.forEach( i->System.out.println("Linha"+i) );
    }
}
