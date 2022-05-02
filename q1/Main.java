package q1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
        figuras.add(new Quadrado());
        figuras.add(new Retangulo());
        figuras.add(new Triangulo());
        figuras.add(new Circulo());

        figuras.forEach(figura -> {
            System.out.printf("Area do %s de tamanho %d é %f\n\n", figura.getNome(), figura.getTamanho(),
                    figura.getArea());
        });
    }
}