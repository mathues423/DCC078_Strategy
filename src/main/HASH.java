package main;

public class HASH implements Encripitacao {
    @Override
    public String encripitar(String dado, int key) {
        String saida = "'encripitado' com HASING";
        return "Dado_encripitado:{" +
                " dado_bruto:" + dado +
                ", key:" + key +
                ", dado_encripitado:" + saida +
                " }";
    }
}
