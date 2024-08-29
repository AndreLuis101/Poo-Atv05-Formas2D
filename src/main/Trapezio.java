package main;

public class Trapezio extends Quadrilatero {

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
        
        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Os pontos fornecidos não formam um trapézio.");
        }
    }
    
    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta base1 = new SegmentoReta(p1, p2);
        SegmentoReta base2 = new SegmentoReta(p3, p4);
        SegmentoReta lado1 = new SegmentoReta(p2, p3);
        SegmentoReta lado2 = new SegmentoReta(p4, p1);

        return base1.paralelo(base2) || lado1.paralelo(lado2);
    }

    public SegmentoReta baseMenor() {
        // Assumindo que baseMenor é o segmento menor entre as bases paralelas
        SegmentoReta base1 = new SegmentoReta(getP1(), getP2());
        SegmentoReta base2 = new SegmentoReta(getP3(), getP4());
        return base1.comprimento() < base2.comprimento() ? base1 : base2;
    }

    public SegmentoReta baseMaior() {
        // Assumindo que baseMaior é o segmento maior entre as bases paralelas
        SegmentoReta base1 = new SegmentoReta(getP1(), getP2());
        SegmentoReta base2 = new SegmentoReta(getP3(), getP4());
        return base1.comprimento() > base2.comprimento() ? base1 : base2;
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double altura() {
        Ponto[] pontos = getPontos();
        double y1 = pontos[0].getCoordY();
        double y2 = pontos[2].getCoordY();
        return Math.abs(y1 - y2);
    }

    @Override
    public double area() {
        double baseMenor = baseMenor().comprimento();
        double baseMaior = baseMaior().comprimento();
        double altura = altura();
        return (baseMenor + baseMaior) * altura / 2.0;
    }

    @Override
    public double perimetro() {
        Ponto[] pontos = getPontos();
        SegmentoReta lado1 = new SegmentoReta(pontos[0], pontos[1]);
        SegmentoReta lado2 = new SegmentoReta(pontos[1], pontos[2]);
        SegmentoReta lado3 = new SegmentoReta(pontos[2], pontos[3]);
        SegmentoReta lado4 = new SegmentoReta(pontos[3], pontos[0]);

        return lado1.comprimento() + lado2.comprimento() + lado3.comprimento() + lado4.comprimento();
    }
}
