import java.util.HashMap;
import java.util.Map;

public class ControladorAuth {
    private final Map<String, Usuario> usuarios = new HashMap<>();

    public ControladorAuth() {
        // Usuarios de ejemplo
        usuarios.put("admin", new Administrador("admin", "Administrador", "1234"));
        usuarios.put("edith", new Editor("edith", "Editora Edith", "Cultura"));
    }

    public Usuario login(String user, String pass) {
        Usuario u = usuarios.get(user);
        if (u instanceof Administrador) {
            if (!((Administrador) u).validarClave(pass)) throw new SecurityException("Clave admin inválida");
        } else if (u == null) {
            throw new SecurityException("Usuario no encontrado");
        }
        return u;
    }
}
