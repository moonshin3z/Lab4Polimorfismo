public class DTOContenido {
    public String tipo;     // "Articulo" | "Video" | "Imagen"
    public String titulo;
    public String autor;

    // Articulo
    public String cuerpo;
    public String resumen;

    // Video
    public String url;
    public Integer duracionSeg;

    // Imagen
    public String rutaArchivo;
    public Integer anchoPx;
    public Integer altoPx;
}
