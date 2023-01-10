package main;

public class Usuario {
    private String dadoUsuario;

    public void encripitarCesar(String dado, int key) {
        Encripitador encripitadora = new Encripitador(dado, key);
        this.dadoUsuario = encripitadora.encripitar(new CESAR());
    }

    public void encripitarHASH(String dado, int key) {
        Encripitador encripitadora = new Encripitador(dado, key);
        this.dadoUsuario = encripitadora.encripitar(new HASH());
    }

    public String getDadoUsuario(){
        return this.dadoUsuario;
    }
}
