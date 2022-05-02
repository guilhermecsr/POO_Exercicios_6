package q2;

public class Juridica extends Pessoa {
    private String razaoSocial;
    private String cnpj;
    private Double faturamento;

    public Juridica(String razaoSocial, String cnpj, Double faturamento, String endereco) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    public String getId() {
        return this.razaoSocial;
    }

    public String getCpfpj() {
        return cnpj;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }
}
