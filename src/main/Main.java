package main;
import main.Ponto;

public class Main {
    public static void main(String[] args) {
        Ponto p1= new Ponto(0.603176, 0.960633);
        Ponto p2= new Ponto(1.000000, 0.958308);
        Ponto p3= new Ponto(0.687735, 0.958308);
        //Testar largura do triangulo;

        System.out.println(p1);
        System.err.println(p2);
        System.err.println(p3);

        Triangulo t1 = new Triangulo(p1, p2, p3);

        System.out.println(t1.largura());
    }
}

