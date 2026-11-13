public class Sms implements CanalNotificacion {
    public void enviar(String usuario, String mensaje) { System.out.println("SMS para " + usuario + ": " + mensaje); }
}
