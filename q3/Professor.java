package q3;

public class Professor extends Participante {
    private String departamento;

    public Professor(String vinculo, String nome, String matricula, String email, String departamento) {
        super(vinculo, nome, matricula, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
