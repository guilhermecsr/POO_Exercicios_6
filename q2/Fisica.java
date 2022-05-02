package q2;

public class Fisica extends Pessoa {
    private String nome;
    private String cpf;
    private String dataDeAniversario;

    public Fisica(String nome, String cpf, String dataDeAniversario, String endereco) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getId() {
        return this.nome;
    }

    public String getCpfpj() {
        return cpf;
    }

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }
}
