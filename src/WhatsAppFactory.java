public class WhatsAppFactory implements NotificadorFactory {
    public CanalNotificacion crearCanal() { return new WhatsApp(); }
}
