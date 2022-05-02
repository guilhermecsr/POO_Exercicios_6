package q3;

public class Aluno extends Participante {
    private String curso;

    public Aluno(String vinculo, String nome, String matricula, String email, String curso) {
        super(vinculo, nome, matricula, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
