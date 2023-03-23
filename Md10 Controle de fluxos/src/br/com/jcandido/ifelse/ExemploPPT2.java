package br.com.jcandido.ifelse;

public class ExemploPPT2 {
    public static void main(String args[]) {
        int result = 4;
        if (result > 1 && result < 5) {
            System.out.println("resultado está entre 1 e 5");
        } else if (result >= 5 && result < 8) {
            System.out.println("resultado está entre 5 e 8");
        } else {
            System.out.println("resultado diferente dos anteriores");
        }
    }
}

