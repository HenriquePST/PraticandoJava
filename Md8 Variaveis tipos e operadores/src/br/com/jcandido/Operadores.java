package br.com.jcandido;

/**
 * @author Joao Henrique
 */

public class Operadores {

    public static void main(String args[]) {
        operacoesAritmeticas();
        operacoesAtribuicao();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicos();
    }

    private static void operacoesLogicos() {

        System.out.println("*****operacoesLogicos *****");

        int b = 10;
        int c = 20;

        boolean Dentro20 = b >= 1 && c <= 20;
        System.out.println(Dentro20);

        boolean Dentro_20 = b >= 1 || c <= 20;
        System.out.println(Dentro_20);

    }

    private static void operacoesRelacionais() {
        System.out.println("*****operacaoRelacionais *****");
        int b = 10;
        int c = 20;

        boolean Mayor = b > c;
        System.out.println(Mayor);

        boolean igual = b == c;
        System.out.println(igual);

        boolean Dif = b != c;
        System.out.println(Dif);

        boolean Mennor = b < c;
        System.out.println(Mennor);

        boolean MayIgual = b >= c;
        System.out.println(MayIgual);

        boolean MennorIgual = b <= c;
        System.out.println(MennorIgual);


    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("*****operacoesIncrementoDecremento*****");
        int incr = 10;
        System.out.println(incr);
        incr++;
        System.out.println(incr);
        incr--;
        System.out.println(incr);
    }

    private static void operacoesAtribuicao() {
        System.out.println("*****operacoesAtribuicao*****");
        int numero = 2;
        int numero1 = 10;
        int numero3 = numero + numero1;
        numero3 += numero3;
        System.out.println(numero3);

    }

    private static void operacoesAritmeticas() {
        System.out.println("*****operacoesAritmeticas*****");

        int num1 = 2;
        int num2 = 3;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int divisao = num1 / num2;
        int multi = num1 * num2;
        int num3 = (10 + 10) / 2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multi);
        System.out.println(num3);
    }
}


