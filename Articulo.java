public class Articulo extends Contenido {
  private String cuerpo;
  private String resumen;

public Articulo(int id, String titulo, String autor, String cuerpo, String resumen) {
  super(id,titulo,autor);
  this.cuerpo = cuerpo;
  this.resumen = resumen;
}

public String getCuerpo() {
  return cuerpo;
}

public String getResumen() {
  return resumen;
}

public void setCuerpo(String cuerpo) {
  this.cuerpo = cuerpo;
}

public void setResumen(String resumen) {
  this.resumen = resumen;
}

@Override
public String visualizar() {
  return "# " + titulo + "\n\n" + (resumen != null ? "**Resumen:** " + resumen + "\n\n" : "") + (cuerpo != null ? cuerpo : "");
}

@Override
public String toString() {
  return "Articulo {id=" + id + ", titulo='" + titulo + "', autor='" + autor + "', estado=" + estado + "}"; 
 }
}
  
