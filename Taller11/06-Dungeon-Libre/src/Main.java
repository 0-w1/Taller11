public class Main {
    public static void main(String[] args) {
        Nivel[] niveles={new Cripta(), new Castillo(), new Glaciar(), new Volcan()};
        for (Nivel nivel:niveles) nivel.recorrer();
    }
}
