public class Main {
    public static void main(String[] args) {
        PanelAdmin admin = new PanelAdmin();
        admin.activarLluvia(2000);
        CalculadoraDomicilio cliente = new CalculadoraDomicilio();
        AppRepartidor repartidor = new AppRepartidor();
        System.out.println("[Admin] Modo lluvia ACTIVADO. Recargo: $2000.0");
        System.out.println("[Cliente] Precio domicilio 3 km: $" + cliente.calcularPrecio(3));
        System.out.println("[Repartidor] Ganancia por 3.0 km: $" + repartidor.calcularGanancia(3));
        System.out.println("Lecturas de configuración: " + ConfiguracionApp.getInstancia().getLecturas());
    }
}
