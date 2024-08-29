package main;


public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser positivo.");
        }
        this.centro = new Ponto(centro); // Garantir imutabilidade
        this.raio = raio;
    }

    @Override
    public double largura() {
        // Largura é o diâmetro do círculo (2 * raio)
        return 2 * raio;
    }

    @Override
    public double altura() {
        // Altura é o raio do círculo
        return raio;
    }

    @Override
    public double area() {
        // Área do semicírculo (metade da área de um círculo)
        return (Math.PI * Math.pow(raio, 2)) / 2;
    }

    @Override
    public double perimetro() {
        // Perímetro do semicírculo (metade da circunferência + diâmetro)
        return Math.PI * raio + 2 * raio;
    }

    public Ponto getCentro() {
        return new Ponto(centro); // Garantir imutabilidade
    }

    public double getRaio() {
        return raio;
    }
}
