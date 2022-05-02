package q1;

public class FiguraGeometrica {
    protected Integer tamanho = 10;
    protected String nome;

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Double getArea() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
