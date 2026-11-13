public class Main {
    public static void main(String[] args) {
        Ventanilla v1=new Ventanilla("Ventanilla 1");
        Ventanilla v2=new Ventanilla("Ventanilla 2");
        KioscoDigital kiosco=new KioscoDigital();
        v1.atender("Martha");
        v2.atender("Jorge");
        kiosco.pedirTurno("Valentina");
        v1.atender("Luis");
        kiosco.pedirTurno("Camila");
    }
}
