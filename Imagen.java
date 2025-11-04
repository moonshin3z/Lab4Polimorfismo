public class Imagen extends Contenido{
  private String rutaArchivo;
  private int altoPx;
  private int anchoPx;

  public Imagen(int id, String titulo, String autor, String rutaArchivo, int altoPx, int anchoPx){
    super(id, titulo, autor);
    this.rutaArchivo = rutaArchivo;
    this.altoPx = altoPx;
    this.anchoPx = anchoPx;

  }

  public String getRutaArchivo(){
    return rutaArchivo;
  }

  public void setRutaArchivo(String rutaArchivo){
    this.rutaArchivo = rutaArchivo;
  }

  public int getAltoPx(){
    return altoPx;
  }

  public void setAltoPx(int altoPx){
    this.altoPx = altoPx;
  }

  public int getAnchoPx(){
    return anchoPx;
  }

  public void setAnchoPx(int anchoPx){
    this.anchoPx = anchoPx;
  }

  @Override
    public String visualizar() {
        return "Imagen: " + getTitulo() +
               " (" + anchoPx + "x" + altoPx + " px) - Ruta: " + rutaArchivo;
    }

   @Override
    public String toString() {
        return "Imagen{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", estado=" + getEstado() +
                ", rutaArchivo='" + rutaArchivo + '\'' +
                ", altoPx=" + altoPx +
                ", anchoPx=" + anchoPx +
                '}';
    }

}

