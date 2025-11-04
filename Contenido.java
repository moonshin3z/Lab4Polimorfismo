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

public void setId(int id) {
    this.id = id; 
  }
  
public int getID() {
  return id;
}

public String getTitulo() {
  return titulo;
}

public String getAutor() {
  return autor;
}

public EstadoPublicacion getEstado() {
  return estado;
}

public List<Categoria> getCategorias() {
  return categorias;
}

public Set<String> getEtiquetas() {
  return etiquetas;
}

@Override
public void agregarCategoria(Categoria categoria) {
  if (categoria != null) {
    categorias.add(categoria);
  }
}

@Override
public void agregarEtiqueta(String tag) {
  if (tag != null && !tag.isBlank()) {
    etiquetas.add(tag.trim());
  }
}

@Override
public void publicar() {
  estado = EstadoPublicacion.PUBLICADO;

@Override
public void despublicar() {
  estado = EstadoPublicacion.BORRADOR;
}

@Override
public abstract String visualizar();

@Override
public String toString() {
  return getClass().getSimpleName() + " {id=" + id + ", titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", estado=" + estado + '}'; }
}



