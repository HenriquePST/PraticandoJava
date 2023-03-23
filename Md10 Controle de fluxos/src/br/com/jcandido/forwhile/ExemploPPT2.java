package br.com.jcandido.forwhile;

public class ExemploPPT2 {
    public static void main(String args[]){
        for(int contador = 1; contador<=100; contador++){
            System.out.println("está é a repeticao nr:" + contador);
            if (contador == 10)
                break;
        }
    }
}
