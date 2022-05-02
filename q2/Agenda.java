package q2;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Pessoa>();
    }

    public void acharContatos(String cpfpj) {

        this.contatos.forEach(contato -> {
            if (contato.getCpfpj() == cpfpj) {
                System.out.println("Contato encontrado: " + contato.getId());
            }
        });
    }

    public void listarContatos() {
        System.out.println("Lista de contatos: \n");
        System.out.println("#####################");

        this.contatos.forEach(contato -> {

            System.out.println(contato.getId());

        });
        System.out.println("#####################");
    }

    public void guardarContato(Pessoa contato) {
        contatos.add(contato);
    }
}
