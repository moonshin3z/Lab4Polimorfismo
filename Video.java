public class Video extends Contenido {
    private String url;
    private int duracionSeg;

    public Video(String titulo, String autor, String url, int duracionSeg) {
        super(titulo, autor);
        this.url = url == null ? "" : url;
        this.duracionSeg = Math.max(0, duracionSeg);
    }

    @Override public String visualizar() {
        return "Video: " + titulo + " (" + duracionSeg + "s) -> " + url;
    }
}
