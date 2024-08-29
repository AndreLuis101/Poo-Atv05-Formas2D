package main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Os pontos não podem ser nulos.");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public double comprimento() {
        double deltaX = p2.getCoordX() - p1.getCoordX();
        double deltaY = p2.getCoordY() - p1.getCoordY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double coeficienteAngular() {
        double deltaX = p2.getCoordX() - p1.getCoordX();
        double deltaY = p2.getCoordY() - p1.getCoordY();
        
        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY;
        }
        
        return deltaY / deltaX;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }


    public boolean paralelo(SegmentoReta s) {
        double coeficienteAtual = this.coeficienteAngular();
        double coeficienteOutro = s.coeficienteAngular();
        
        // Comparar com tolerância
        if (Double.isInfinite(coeficienteAtual) && Double.isInfinite(coeficienteOutro)) {
            return true; // Ambas as retas são verticais
        }
        
        return Math.abs(coeficienteAtual - coeficienteOutro) < 1e-6;
    }
    
}
