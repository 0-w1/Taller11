public class Main {
    public static void main(String[] args) {
        CanalVenta taquilla=new CanalVenta("Taquilla");
        CanalVenta app=new CanalVenta("App");
        taquilla.comprar(new Boleta.Builder("Amazonas Perdido", "F7").tresD().vip().combo("nachos").build());
        app.comprar(new Boleta.Builder("Amazonas Perdido", "F8").estudiante().build());
        app.comprar(new Boleta.Builder("Amazonas Perdido", "F7").combo("crispetas").build());
    }
}
