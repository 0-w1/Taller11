public class SmsFactory implements NotificadorFactory {
    public CanalNotificacion crearCanal() { return new Sms(); }
}
