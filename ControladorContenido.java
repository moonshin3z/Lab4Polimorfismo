import java.util.List;

public class ControladorContenido {
    private final ServicioContenido svc;
    private final ServicioBusqueda svcBusqueda;
    private final ServicioReporte svcReporte;

    public ControladorContenido(ServicioContenido svc, ServicioBusqueda svcBusqueda, ServicioReporte svcReporte) {
        this.svc = svc;
        this.svcBusqueda = svcBusqueda;
        this.svcReporte = svcReporte;
    }

    public void crearContenido(DTOContenido dto) {
        Contenido c;
        switch (dto.tipo) {
            case "Articulo":
                c = new Articulo(dto.titulo, dto.autor, dto.cuerpo, dto.resumen);
                break;
            case "Video":
                c = new Video(dto.titulo, dto.autor, dto.url, dto.duracionSeg == null ? 0 : dto.duracionSeg);
                break;
            case "Imagen":
                c = new Imagen(dto.titulo, dto.autor, dto.rutaArchivo,
                        dto.anchoPx == null ? 0 : dto.anchoPx,
                        dto.altoPx  == null ? 0 : dto.altoPx);
                break;
            default:
                throw new IllegalArgumentException("Tipo no soportado: " + dto.tipo);
        }
        svc.crear(c);
    }

    public void editarContenido(Contenido c) { svc.editar(c); }
    public void eliminarContenido(int id)    { svc.eliminar(id); }

    public void publicarContenido(int id, Usuario actor)     { svc.publicar(id, actor); }
    public void despublicarContenido(int id, Usuario actor)  { svc.despublicar(id, actor); }

    public List<Contenido> listarFiltrado(CriterioBusqueda criterio) { return svcBusqueda.buscar(criterio); }

    public ReporteDTO generarReporte() { return svcReporte.generarReporteBasico(); }
}
