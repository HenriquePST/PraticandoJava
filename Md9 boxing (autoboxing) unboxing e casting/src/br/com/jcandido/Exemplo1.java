package br.com.jcandido;


/**
 * @author Joao Henrique
 */

// praticando Autoboxing e Unboxing
public class Exemplo1 {
    public static void main (String args[]){

        //Autoboxing
        Boolean status = true;
        Boolean status3 = Boolean.TRUE;

        Character c = 'a';

        Integer idade = 10;

        Long cpf8 = 12345L;

        Long cpf = Long.valueOf(123);
        Long cpf1 = 123456L;

        // Unboxing

        Boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('b');

        int idade2 = Integer.valueOf(12);

        Long cpf23 = Long.valueOf(12345);


    }
}
