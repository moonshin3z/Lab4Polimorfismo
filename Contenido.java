import java.util.LocalDateTime;
import java.util.*;

public abstract class Contenido implements Categorizable, Publicable {
  protected int id;
  protected String titulo;
  protected String autor;
  protected LocalDateTime fechaCreacion;
  protected EstadoPublicacion estado;
  protected List<Categoria> categorias;
  protected Set<String> etiquetas;

public Contenido(int id, String titulo, String autor) {
  this.id = id;
  this.titulo = titulo;
  this.autor;
  this.fechaCreacion = LocalDateTime.now();
  this.estado = EstadoPublicacion.BORRADOR;
  this.categorias = new ArrayList<>();
  this.etiquetas = new HashSet<>();

}
