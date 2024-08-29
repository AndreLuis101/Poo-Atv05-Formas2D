package main;

public abstract class Poligono extends FormaGeometrica {
    private final Ponto[] pontos;

    public Poligono(Ponto[] pontos) {
        if (pontos == null || pontos.length < 3) {
            throw new IllegalArgumentException("Um polígono deve ser definido por pelo menos 3 pontos.");
        }
        for (Ponto ponto : pontos) {
            if (ponto == null) {
                throw new IllegalArgumentException("Os pontos não podem ser nulos.");
            }
        }
        this.pontos = new Ponto[pontos.length];
        for (int i = 0; i < pontos.length; i++) {
            this.pontos[i] = new Ponto(pontos[i]);
        }
    }

    public Ponto[] getPontos() {
        Ponto[] copiaPontos = new Ponto[pontos.length];
        for (int i = 0; i < pontos.length; i++) {
            copiaPontos[i] = new Ponto(pontos[i]);
        }
        return copiaPontos;
    }
}
