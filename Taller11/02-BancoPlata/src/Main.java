public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();
        NotificadorFactory[] fabricas = {new SmsFactory(), new EmailFactory(), new PushFactory(), new WhatsAppFactory()};
        for (NotificadorFactory fabrica : fabricas) {
            servicio.notificarTransferencia(fabrica, "Juan", "Transferencia realizada");
            servicio.notificarSeguridad(fabrica, "Juan", "Tu código es 4821");
        }
    }
}
