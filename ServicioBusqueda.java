import java.util.*;
import java.util.stream.Collectors;

public class ServicioBusqueda {
    private final RepositorioContenido repo;

    public ServicioBusqueda(RepositorioContenido repo) {
        this.repo = repo;
    }

    public List<Contenido> listarTodos() {
        return repo.listar();
    }

    public List<Contenido> buscar(CriterioBusqueda cb) {
        return repo.listar().stream()
            .filter(c -> cb.tipo().map(t -> t.isInstance(c)).orElse(true))
            .filter(c -> cb.estado().map(e -> c.getEstado()==e).orElse(true))
            .filter(c -> cb.categoria().map(nombre ->
                c.getCategorias().stream().anyMatch(cat -> cat.getNombre().equalsIgnoreCase(nombre))
            ).orElse(true))
            .filter(c -> cb.etiqueta().map(tag ->
                c.getEtiquetas().stream().anyMatch(e -> e.equalsIgnoreCase(tag))
            ).orElse(true))
            .collect(Collectors.toList());
    }
}
