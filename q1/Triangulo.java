package q1;

public class Triangulo extends FiguraGeometrica {
    private Integer base;
    private Integer altura;

    public Triangulo() {
        this.base = this.tamanho / 2;
        this.altura = this.tamanho;
        this.nome = "Triângulo";
    }

    public Double getArea() {
        return (double) (this.base * this.altura) / 2;
    }
}
