public abstract class Nivel {
    public abstract Enemigo crearEnemigo();
    public int cantidadEnemigos() { return 1; }
    public void recorrer() {
        for (int i=0; i<cantidadEnemigos(); i++) crearEnemigo().atacar();
    }
}
