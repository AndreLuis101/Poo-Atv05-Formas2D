package main;

/**
 * Classe concreta para representar um triângulo.
 */
public class Triangulo extends Poligono {

    private final Ponto p1;
    private final Ponto p2;
    private final Ponto p3;

    /**
     * Construtor para criar um triângulo com três pontos.
     *
     * @param p1 ponto 1 do triângulo
     * @param p2 ponto 2 do triângulo
     * @param p3 ponto 3 do triângulo
     */
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{p1, p2, p3});
        this.p1 = new Ponto(p1); // Garantir imutabilidade
        this.p2 = new Ponto(p2); // Garantir imutabilidade
        this.p3 = new Ponto(p3); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p1 do triângulo.
     *
     * @return o ponto p1
     */
    public Ponto getP1() {
        return new Ponto(p1); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p2 do triângulo.
     *
     * @return o ponto p2
     */
    public Ponto getP2() {
        return new Ponto(p2); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p3 do triângulo.
     *
     * @return o ponto p3
     */
    public Ponto getP3() {
        return new Ponto(p3); // Garantir imutabilidade
    }

    @Override
    public double largura() {
        Ponto[] pontos = getPontos();
        double minX = Math.min(Math.min(pontos[0].getCoordX(), pontos[1].getCoordX()), pontos[2].getCoordX());
        double maxX = Math.max(Math.max(pontos[0].getCoordX(), pontos[1].getCoordX()), pontos[2].getCoordX());
        return maxX - minX;
    }

    public double altura() {
        Ponto[] pontos = getPontos();
        double minY = Math.min(Math.min(pontos[0].getCoordY(), pontos[1].getCoordY()), pontos[2].getCoordY());
        double maxY = Math.max(Math.max(pontos[0].getCoordY(), pontos[1].getCoordY()), pontos[2].getCoordY());
        return maxY - minY;
    }

    @Override
    public double area() {
        Ponto[] pontos = getPontos();
        double x1 = pontos[0].getCoordX();
        double y1 = pontos[0].getCoordY();
        double x2 = pontos[1].getCoordX();
        double y2 = pontos[1].getCoordY();
        double x3 = pontos[2].getCoordX();
        double y3 = pontos[2].getCoordY();

        return Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0);
    }

    @Override
    public double perimetro() {
        Ponto[] pontos = getPontos();
        SegmentoReta lado1 = new SegmentoReta(pontos[0], pontos[1]);
        SegmentoReta lado2 = new SegmentoReta(pontos[1], pontos[2]);
        SegmentoReta lado3 = new SegmentoReta(pontos[2], pontos[0]);

        return lado1.comprimento() + lado2.comprimento() + lado3.comprimento();
    }
}
