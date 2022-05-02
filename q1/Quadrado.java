package q1;

public class Quadrado extends Quadrilatero {
    private Integer lado;

    public Quadrado() {
        this.lado = this.tamanho;
        this.nome = "Quadrado";
    }

    @Override
    public Double getArea() {
        return (double) (this.lado * this.lado);
    }
}
