package br.com.jcandido;

public class Exemplo2 {

    public static void main(String args[]) {

        // boolean = 1bit
        // byte = 8bits
        // char = 16bits
        // short = 16bits
        // int = 32bits
        // float 32bits
        // double = 64bits
        // long = 64bits


        //Casting é um recurso, que possibilita mudar um valor de um tipo para o outro.

        //Implicito

        int num1 = 10;

        //Explicito

        Short num2 = (short) num1;


        //Explicitamente
        long num3 = 22222224444222222L;
        int num4 = (int) num3;
        System.out.println(num4);

        //implicito do menor para o maior.

        int idade = 30;
        long idadel = idade;

        byte b = 1;
        short s = b;
        System.out.println(b);

        // Explicito

        short b1 = b;
        byte b2 = (byte) b1;
        long l = b2;

        System.out.println(b1);


    }
}
