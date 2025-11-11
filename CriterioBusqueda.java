import java.util.Optional;

public class CriterioBusqueda {
    public Class<? extends Contenido> tipo; // opcional
    public String categoria;                // opcional (nombre)
    public String etiqueta;                 // opcional
    public EstadoPublicacion estado;        // opcional

    public Optional<Class<? extends Contenido>> tipo() { return Optional.ofNullable(tipo); }
    public Optional<String> categoria() { return Optional.ofNullable(categoria); }
    public Optional<String> etiqueta() { return Optional.ofNullable(etiqueta); }
    public Optional<EstadoPublicacion> estado() { return Optional.ofNullable(estado); }
}
