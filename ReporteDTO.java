import java.util.Map;

public class ReporteDTO {
    public Map<String, Integer> porTipo;
    public Map<String, Integer> porAutor;

    public ReporteDTO(Map<String, Integer> porTipo, Map<String, Integer> porAutor) {
        this.porTipo = porTipo;
        this.porAutor = porAutor;
    }
}

