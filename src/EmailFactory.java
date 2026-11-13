public class EmailFactory implements NotificadorFactory {
    public CanalNotificacion crearCanal() { return new Email(); }
}
