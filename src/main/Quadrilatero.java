package main;

/**
 * Classe abstrata para representar um quadrilátero.
 */
public abstract class Quadrilatero extends Poligono {

    private final Ponto p1;
    private final Ponto p2;
    private final Ponto p3;
    private final Ponto p4;

    /**
     * Construtor para criar um quadrilátero com quatro pontos.
     *
     * @param p1 ponto 1 do quadrilátero
     * @param p2 ponto 2 do quadrilátero
     * @param p3 ponto 3 do quadrilátero
     * @param p4 ponto 4 do quadrilátero
     */
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[]{p1, p2, p3, p4});
        this.p1 = new Ponto(p1); // Garantir imutabilidade
        this.p2 = new Ponto(p2); // Garantir imutabilidade
        this.p3 = new Ponto(p3); // Garantir imutabilidade
        this.p4 = new Ponto(p4); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p1 do quadrilátero.
     *
     * @return o ponto p1
     */
    public Ponto getP1() {
        return new Ponto(p1); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p2 do quadrilátero.
     *
     * @return o ponto p2
     */
    public Ponto getP2() {
        return new Ponto(p2); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p3 do quadrilátero.
     *
     * @return o ponto p3
     */
    public Ponto getP3() {
        return new Ponto(p3); // Garantir imutabilidade
    }

    /**
     * Retorna o ponto p4 do quadrilátero.
     *
     * @return o ponto p4
     */
    public Ponto getP4() {
        return new Ponto(p4); // Garantir imutabilidade
    }
}
