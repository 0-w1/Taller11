public class CanalVenta {
    private final String nombre;
    private final MapaSillas mapa=MapaSillas.getInstancia();
    public CanalVenta(String nombre) { this.nombre=nombre; }
    public void comprar(Boleta boleta) {
        try {
            mapa.reservar(boleta.getPelicula(), boleta.getSilla());
            System.out.println("["+nombre+"] VENDIDA: "+boleta);
        } catch (IllegalStateException e) {
            System.out.println("["+nombre+"] VENTA RECHAZADA: "+e.getMessage());
        }
    }
}
