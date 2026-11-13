public class Main {
    public static void main(String[] args) {
        Hamburguesa pedido1 = new Hamburguesa.Builder("res", 2).tocineta().salsa("bbq").build();
        Hamburguesa pedido2 = new Hamburguesa.Builder("pollo", 1).pepinillos().build();
        System.out.println(pedido1);
        System.out.println(pedido2);
        try {
            new Hamburguesa.Builder("res", 7).pan("brioche").salsa("miel mostaza").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Pedido rechazado: " + e.getMessage());
        }
    }
}
