package main;

public class Paralelogramo extends Trapezio {

    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);

        // Verifica se os pontos fornecidos formam um paralelogramo
        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Os pontos fornecidos não formam um paralelogramo.");
        }
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        // Calcula os segmentos de reta
        SegmentoReta segmento1 = new SegmentoReta(p1, p2);
        SegmentoReta segmento2 = new SegmentoReta(p2, p3);
        SegmentoReta segmento3 = new SegmentoReta(p3, p4);
        SegmentoReta segmento4 = new SegmentoReta(p4, p1);

        // Verifica se os segmentos opostos são paralelos
        boolean ladosOpostosParalelos = segmento1.paralelo(segmento3) && segmento2.paralelo(segmento4);

        return ladosOpostosParalelos;
    }

    @Override
    public double largura() {
        // A largura de um paralelogramo é a base menor
        return baseMenor().comprimento();
    }

    @Override
    public double altura() {
        // Para calcular a altura, usamos a fórmula da área
        return area() / baseMenor().comprimento();
    }

    @Override
    public double area() {
        // A área do paralelogramo é base * altura
        return baseMenor().comprimento() * altura();
    }

    @Override
    public double perimetro() {
        // O perímetro é a soma dos quatro lados
        SegmentoReta lado1 = new SegmentoReta(getP1(), getP2());
        SegmentoReta lado2 = new SegmentoReta(getP2(), getP3());
        return 2 * (lado1.comprimento() + lado2.comprimento());
    }
}
