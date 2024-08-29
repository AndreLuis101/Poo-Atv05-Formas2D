package main;


public class Retangulo extends Paralelogramo {

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Os pontos fornecidos não formam um retângulo.");
        }
    }


    public boolean quadrado() {
        SegmentoReta lado1 = new SegmentoReta(getPontos()[0], getPontos()[1]); 
        SegmentoReta lado2 = new SegmentoReta(getPontos()[1], getPontos()[2]); 

        return Double.compare(lado1.comprimento(), lado2.comprimento()) == 0;
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta lado1 = new SegmentoReta(p1, p2);
        SegmentoReta lado2 = new SegmentoReta(p2, p3);
        SegmentoReta lado3 = new SegmentoReta(p3, p4); 
        SegmentoReta lado4 = new SegmentoReta(p4, p1);

        return Paralelogramo.existe(p1, p2, p3, p4) && ehPerpendicular(lado1, lado2) && ehPerpendicular(lado2, lado3);
    }


    private static boolean ehPerpendicular(SegmentoReta s1, SegmentoReta s2) {
        if (Double.isInfinite(s1.coeficienteAngular()) && Double.compare(s2.coeficienteAngular(), 0) == 0) {
            return true;
        }
        if (Double.isInfinite(s2.coeficienteAngular()) && Double.compare(s1.coeficienteAngular(), 0) == 0) {
            return true;
        }
        return Double.compare(s1.coeficienteAngular() * s2.coeficienteAngular(), -1.0) == 0;
    }
}
