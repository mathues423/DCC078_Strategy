package teste;

import main.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveEncripitarCESAR() {
        Usuario usuario = new Usuario();
        usuario.encripitarCesar("Dado", 1);
        assertEquals("Dado_encripitado:{ dado_bruto:Dado, key:1, dado_encripitado:Ebep }", usuario.getDadoUsuario());
    }

    @Test
    void deveEncripitarHASH() {
        Usuario usuario = new Usuario();
        usuario.encripitarHASH("Dado", 1);
        assertEquals("Dado_encripitado:{ dado_bruto:Dado, key:1, dado_encripitado:'encripitado' com HASING }", usuario.getDadoUsuario());
    }
}