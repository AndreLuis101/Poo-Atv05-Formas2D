package main;

public class Circulo extends Elipse {

    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser positivo.");
        }
    }

    @Override
    public double circunferencia() {
        // Fórmula exata para a circunferência de um círculo: 2πr
        return 2 * Math.PI * getSemiEixoMaior();
    }

    public double getRaio() {
        return getSemiEixoMaior();
    }

    @Override
    public double area() {
        // Área do círculo: πr^2
        double raio = getRaio();
        return Math.PI * Math.pow(raio, 2);
    }
}
