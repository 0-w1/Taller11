public class Main {
    public static void main(String[] args) {
        PaqueteViaje p1 = new PaqueteViaje.Builder("Villa de Leyva", 2).hotel("Posada del Sol").seguro().build();
        PaqueteViaje p2 = new PaqueteViaje.Builder("Salento", 3).tour("Cafe en Salento").build();
        System.out.println(p1);
        System.out.println(p2);
        try {
            new PaqueteViaje.Builder("San Andres", 0).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Paquete rechazado: " + e.getMessage());
        }
    }
}
