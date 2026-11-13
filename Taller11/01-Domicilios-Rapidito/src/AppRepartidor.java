public class AppRepartidor {
    private final ConfiguracionApp config = ConfiguracionApp.getInstancia();

    public double calcularGanancia(double km) {
        return km * config.getValorPorKm() + config.getRecargoLluvia();
    }
}
