public class Email implements CanalNotificacion {
    public void enviar(String usuario, String mensaje) { System.out.println("EMAIL para " + usuario + ": " + mensaje); }
}
