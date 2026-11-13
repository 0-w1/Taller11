public class Hamburguesa {
    private final String proteina;
    private final int porciones;
    private final String pan;
    private final boolean tocineta;
    private final boolean queso;
    private final boolean pepinillos;
    private final String salsa;

    private Hamburguesa(Builder builder) {
        if (builder.proteina == null || builder.proteina.isBlank()) throw new IllegalArgumentException("La proteína es obligatoria");
        if (builder.porciones < 1 || builder.porciones > 3) throw new IllegalArgumentException("Las porciones deben estar entre 1 y 3");
        this.proteina = builder.proteina;
        this.porciones = builder.porciones;
        this.pan = builder.pan;
        this.tocineta = builder.tocineta;
        this.queso = builder.queso;
        this.pepinillos = builder.pepinillos;
        this.salsa = builder.salsa;
    }

    public static class Builder {
        private final String proteina;
        private final int porciones;
        private String pan = "brioche";
        private boolean tocineta;
        private boolean queso;
        private boolean pepinillos;
        private String salsa;

        public Builder(String proteina, int porciones) { this.proteina = proteina; this.porciones = porciones; }
        public Builder pan(String pan) { this.pan = pan; return this; }
        public Builder tocineta() { this.tocineta = true; return this; }
        public Builder queso() { this.queso = true; return this; }
        public Builder pepinillos() { this.pepinillos = true; return this; }
        public Builder salsa(String salsa) { this.salsa = salsa; return this; }
        public Hamburguesa build() { return new Hamburguesa(this); }
    }

    public String toString() {
        return "Hamburguesa de " + proteina + " x" + porciones + " | pan: " + pan
            + (tocineta ? " | tocineta" : "") + (queso ? " | queso" : "")
            + (pepinillos ? " | pepinillos" : "") + " | salsa: " + (salsa == null ? "ninguna" : salsa);
    }
}
