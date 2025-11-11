import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RepositorioContenidoMemoria implements RepositorioContenido {
    private final Map<Integer, Contenido> data = new LinkedHashMap<>();
    private final AtomicInteger secuencia = new AtomicInteger(1);

    @Override public void agregar(Contenido c) {
        int id = secuencia.getAndIncrement();
        c.setId(id);
        data.put(id, c);
    }

    @Override public void actualizar(Contenido c) {
        if (!data.containsKey(c.getId())) throw new NoSuchElementException("No existe id " + c.getId());
        data.put(c.getId(), c);
    }

    @Override public void eliminar(int id) {
        data.remove(id);
    }

    @Override public Contenido buscarPorId(int id) {
        return data.get(id);
    }

    @Override public List<Contenido> listar() {
        return new ArrayList<>(data.values());
    }
}
