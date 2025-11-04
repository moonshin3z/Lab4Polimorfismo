import java.util.List;
public interface RepositorioContenido.java {
    void agregar(Contenido c);
    void actualizar(Contenido c);
    void eliminar(int id);
    Contenido buscarPorId(int id);
    List<Contenido> listar();
}
  

