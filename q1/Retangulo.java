package q1;

public class Retangulo extends Quadrilatero {
    private Integer altura;
    private Integer base;

    public Retangulo() {
        this.altura = this.tamanho;
        this.base = this.tamanho / 2;
        this.nome = "Retângulo";
    }

    public Double getArea() {
        return (double) (this.base * this.altura);
    }
}
