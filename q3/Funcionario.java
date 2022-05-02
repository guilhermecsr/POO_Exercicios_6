package q3;

public class Funcionario extends Participante {
    private String cargo;

    public Funcionario(String vinculo, String nome, String matricula, String email, String cargo) {
        super(vinculo, nome, matricula, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
