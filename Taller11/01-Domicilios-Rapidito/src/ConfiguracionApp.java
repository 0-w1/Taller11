public class ConfiguracionApp {
    private static final ConfiguracionApp instancia = new ConfiguracionApp();
    private final double tarifaBase = 4500;
    private final double valorPorKm = 800;
    private double recargoLluvia;
    private int lecturas = 1;

    private ConfiguracionApp() { }

    public static ConfiguracionApp getInstancia() {
        return instancia;
    }

    public double getTarifaBase() { return tarifaBase; }
    public double getValorPorKm() { return valorPorKm; }
    public double getRecargoLluvia() { return recargoLluvia; }
    public void setRecargoLluvia(double recargo) { recargoLluvia = recargo; }
    public int getLecturas() { return lecturas; }
}
