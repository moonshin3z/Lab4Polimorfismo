import java.util.*;
import java.util.stream.Collectors;

public class ServicioReporte {
    private final RepositorioContenido repo;

    public ServicioReporte(RepositorioContenido repo) {
        this.repo = repo;
    }

    public Map<String, Integer> resumenPorTipo() {
        return repo.listar().stream()
            .collect(Collectors.toMap(
                c -> c.getClass().getSimpleName(),
                c -> 1,
                Integer::sum,
                LinkedHashMap::new
            ));
    }

    public Map<String, Integer> resumenPorAutor() {
        return repo.listar().stream()
            .collect(Collectors.toMap(
                Contenido::getAutor,
                c -> 1,
                Integer::sum,
                LinkedHashMap::new
            ));
    }

    public ReporteDTO generarReporteBasico() {
        return new ReporteDTO(resumenPorTipo(), resumenPorAutor());
    }
}
