public class Ventanilla {
    private final GeneradorTurnos generador = GeneradorTurnos.getInstancia();
    private final String nombre;
    public Ventanilla(String nombre) { this.nombre=nombre; }
    public void atender(String paciente) { System.out.println("["+nombre+"] "+paciente+" -> "+generador.generarTurno()); }
}
