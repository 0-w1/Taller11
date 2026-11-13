public class Push implements CanalNotificacion {
    public void enviar(String usuario, String mensaje) { System.out.println("PUSH para " + usuario + ": " + mensaje); }
}
