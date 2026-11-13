public class ServicioNotificaciones {
    public void notificarTransferencia(NotificadorFactory fabrica, String usuario, String mensaje) {
        fabrica.crearCanal().enviar(usuario, mensaje);
    }

    public void notificarSeguridad(NotificadorFactory fabrica, String usuario, String mensaje) {
        fabrica.crearCanal().enviar(usuario, mensaje);
    }
}
