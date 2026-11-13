import java.util.HashSet;
import java.util.Set;

public class MapaSillas {
    private static final MapaSillas instancia = new MapaSillas();
    private final Set<String> sillasVendidas = new HashSet<>();
    private MapaSillas() { }
    public static MapaSillas getInstancia() { return instancia; }
    public synchronized void reservar(String pelicula, String silla) {
        String clave=pelicula+"-"+silla;
        if (!sillasVendidas.add(clave)) throw new IllegalStateException("La silla "+silla+" ya fue vendida para "+pelicula);
    }
}
