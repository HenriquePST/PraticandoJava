package br.com.jcandido;

/**
 * @author Joao Henrique
 *
 */
public class Exemplos {

// variaveis de classe
// tipo primitivos;
    private int codigo = 1;
    private long codigoMaior = 202020;
    private double valorDecimal1 = 10.1;
    private boolean status = true;
    private String texto = "teste";

    //criando um construtor.
    public Exemplos (){

    }

    public Exemplos (int val){
        this.codigo = val;

    }

    private float valorDecimal = 10.1f;
    private short shor;
    private byte by;



    // variavies de metodos
    public String retornartexto() {
        this.codigo = 0;
        return "texto";
    }

    public int retornainteiro() {
        int val =  10;
        String texto = "texto";
        this.texto = null;
        return val;
    }
    public long retornaLongg(long num) {
        this.texto = "teasass ";
        return num;
    }
}

