public class CalculadoraDomicilio {
    private final ConfiguracionApp config = ConfiguracionApp.getInstancia();

    public double calcularPrecio(double km) {
        return config.getTarifaBase() + km * config.getValorPorKm() + config.getRecargoLluvia();
    }
}
