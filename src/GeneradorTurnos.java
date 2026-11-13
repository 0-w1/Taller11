public class GeneradorTurnos {
    private static final GeneradorTurnos instancia = new GeneradorTurnos();
    private int siguiente = 1;

    private GeneradorTurnos() { }

    public static GeneradorTurnos getInstancia() { return instancia; }

    public synchronized String generarTurno() {
        return String.format("T-%03d", siguiente++);
    }
}
