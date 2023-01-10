package main;

public class CESAR implements Encripitacao {

    @Override
    public String encripitar(String dado, int key) {
        String saida = "";
        int s;
        for(int i = 0; i < dado.length(); i++){
            s = dado.charAt(i) + key;
            saida += String.valueOf(Character.toChars(s));
        }
        return "Dado_encripitado:{" +
                " dado_bruto:" + dado +
                ", key:" + key +
                ", dado_encripitado:" + saida +
                " }";
    }
}
