package main;

public class Encripitador {
    private String dado;
    private int key;

    public Encripitador(String dado, int key) {
        this.dado = dado;
        this.key = key;
    }

    public String encripitar(Encripitacao encripitacao){
        return encripitacao.encripitar(this.dado,this.key);
    }

}
