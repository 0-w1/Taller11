public class PushFactory implements NotificadorFactory {
    public CanalNotificacion crearCanal() { return new Push(); }
}
