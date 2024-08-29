package main;

public class Elipse extends FormaGeometrica {
    private final Ponto centro;
    private final double semiEixoMaior;
    private final double semiEixoMenor;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        if (semiEixoA <= 0 || semiEixoB <= 0) {
            throw new IllegalArgumentException("Os semi-eixos devem ser positivos.");
        }
        this.centro = centro;
        if (semiEixoA >= semiEixoB) {
            this.semiEixoMaior = semiEixoA;
            this.semiEixoMenor = semiEixoB;
        } else {
            this.semiEixoMaior = semiEixoB;
            this.semiEixoMenor = semiEixoA;
        }
    }
    
    public Ponto getCentro() {
        return new Ponto(centro); 
    }

    public double getSemiEixoMenor() {
        return semiEixoMenor;
    }

    public double getSemiEixoMaior() {
        return semiEixoMaior;
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }

    public double circunferencia() {
        return 2 * Math.PI * Math.sqrt((Math.pow(semiEixoMaior, 2) + Math.pow(semiEixoMenor, 2)) / 2);
    }

    @Override
    public double largura() {
        return 2 * semiEixoMaior;
    }

    @Override
    public double altura() {
        return 2 * semiEixoMenor;
    }

    @Override
    public double area() {
        return Math.PI * semiEixoMaior * semiEixoMenor;
    }
}
