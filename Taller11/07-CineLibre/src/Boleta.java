public class Boleta {
    private final String pelicula, silla, combo;
    private final boolean tresD, vip, estudiante;
    private Boleta(Builder b) {
        if (b.pelicula==null || b.pelicula.isBlank()) throw new IllegalArgumentException("La película es obligatoria");
        if (b.silla==null || b.silla.isBlank()) throw new IllegalArgumentException("La silla es obligatoria");
        pelicula=b.pelicula; silla=b.silla; tresD=b.tresD; vip=b.vip; combo=b.combo; estudiante=b.estudiante;
    }
    public String getPelicula() { return pelicula; }
    public String getSilla() { return silla; }
    public static class Builder {
        private final String pelicula, silla;
        private boolean tresD, vip, estudiante;
        private String combo;
        public Builder(String pelicula, String silla) { this.pelicula=pelicula; this.silla=silla; }
        public Builder tresD() { tresD=true; return this; }
        public Builder vip() { vip=true; return this; }
        public Builder combo(String valor) { combo=valor; return this; }
        public Builder estudiante() { estudiante=true; return this; }
        public Boleta build() { return new Boleta(this); }
    }
    public String toString() {
        String tipo=tresD ? "3D" : "2D";
        return pelicula+" | silla "+silla+" | "+tipo+(vip ? " | VIP" : "")+(combo!=null ? " | combo "+combo : "")+(estudiante ? " | tarifa estudiante" : "");
    }
}
