package q1;

public class Circulo extends FiguraGeometrica {
    private Integer raio;

    public Circulo() {
        this.raio = this.tamanho;
        this.nome = "Círculo";
    }

    public Double getArea() {
        return this.raio * this.raio * Math.PI;
    }
}
