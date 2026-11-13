public class PaqueteViaje {
    private final String destino;
    private final int noches;
    private final String vuelo;
    private final String hotel;
    private final String desayuno;
    private final String tour;
    private final boolean seguro;

    private PaqueteViaje(Builder b) {
        if (b.destino == null || b.destino.isBlank()) throw new IllegalArgumentException("El destino es obligatorio");
        if (b.noches < 1) throw new IllegalArgumentException("El paquete debe tener al menos una noche");
        destino=b.destino; noches=b.noches; vuelo=b.vuelo; hotel=b.hotel; desayuno=b.desayuno; tour=b.tour; seguro=b.seguro;
    }

    public static class Builder {
        private final String destino;
        private final int noches;
        private String vuelo, hotel, desayuno, tour;
        private boolean seguro;
        public Builder(String destino, int noches) { this.destino=destino; this.noches=noches; }
        public Builder vuelo(String valor) { vuelo=valor; return this; }
        public Builder hotel(String valor) { hotel=valor; return this; }
        public Builder desayuno(String valor) { desayuno=valor; return this; }
        public Builder tour(String valor) { tour=valor; return this; }
        public Builder seguro() { seguro=true; return this; }
        public PaqueteViaje build() { return new PaqueteViaje(this); }
    }

    public String toString() {
        String r=destino+" ("+noches+" noches)";
        if (vuelo!=null) r+=" + vuelo "+vuelo;
        if (hotel!=null) r+=" + hotel "+hotel;
        if (desayuno!=null) r+=" + desayuno "+desayuno;
        if (tour!=null) r+=" + tour "+tour;
        if (seguro) r+=" + seguro";
        return r;
    }
}
