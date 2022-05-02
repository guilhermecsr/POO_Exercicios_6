package q2;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Fisica pf = new Fisica("Fulano", "cpf", "dataDeAniversario", "endereco");
        Juridica pj = new Juridica("razaoSocial", "cnpj", 1.0, "endereco");

        agenda.guardarContato(pf);
        agenda.guardarContato(pj);
        agenda.listarContatos();
        agenda.acharContatos("cpf");
        agenda.acharContatos("cnpj");
    }
}