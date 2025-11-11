import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Infra
        RepositorioContenido repo = new RepositorioContenidoMemoria();
        ServicioContenido sContenido = new ServicioContenido(repo);
        ServicioBusqueda sBusqueda = new ServicioBusqueda(repo);
        ServicioReporte sReporte = new ServicioReporte(repo);
        ControladorContenido ctrl = new ControladorContenido(sContenido, sBusqueda, sReporte);
        ControladorAuth auth = new ControladorAuth();

        // Login como admin
        Usuario admin = auth.login("admin", "1234");

        // Crear contenidos de ejemplo
        DTOContenido a = new DTOContenido();
        a.tipo = "Articulo"; a.titulo = "Patrones de Diseño"; a.autor = "Iván"; a.resumen = "Resumen de patrones";
        a.cuerpo = "Texto largo...";
        ctrl.crearContenido(a);

        DTOContenido v = new DTOContenido();
        v.tipo = "Video"; v.titulo = "Intro a POO"; v.autor = "Edgar"; v.url = "https://video.example/poo"; v.duracionSeg = 95;
        ctrl.crearContenido(v);

        DTOContenido i = new DTOContenido();
        i.tipo = "Imagen"; i.titulo = "Diagrama UML"; i.autor = "Iván"; i.rutaArchivo = "/imgs/uml.png"; i.anchoPx = 800; i.altoPx = 600;
        ctrl.crearContenido(i);

        // Publicar el artículo (id = 1)
        ctrl.publicarContenido(1, admin);

        // Listar todo
        System.out.println("=== LISTA COMPLETA ===");
        for (Contenido c : sBusqueda.listarTodos()) {
            System.out.println(c + " -> " + c.visualizar());
        }

        // Búsqueda por tipo: Video
        System.out.println("\n=== FILTRO: SOLO VIDEO ===");
        CriterioBusqueda cb = new CriterioBusqueda();
        cb.tipo = Video.class;
        List<Contenido> filtrados = ctrl.listarFiltrado(cb);
        filtrados.forEach(x -> System.out.println(x.visualizar()));

        // Reporte
        System.out.println("\n=== REPORTE ===");
        ReporteDTO rep = ctrl.generarReporte();
        System.out.println("Por Tipo: " + rep.porTipo);
        System.out.println("Por Autor: " + rep.porAutor);

        System.out.println("\nOK.");
    }
}
