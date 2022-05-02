package q3;

import java.util.Scanner;

public class Participante {
    private String vinculo;
    private String nome;
    private String matricula;
    private String email;
    static Scanner keyboard = new Scanner(System.in);

    public Participante(String vinculo, String nome, String matricula, String email) {
        this.vinculo = vinculo;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void cadastraParticipante(Evento evento) {
        while (true) {
            System.out.println("Agora vamos cadastrar os participantes");
            System.out.println("O participante é professor ou aluno?");
            String vinculo = keyboard.nextLine();

            System.out.println("Nome");
            String nome = keyboard.nextLine();

            System.out.println("Matrícula");
            String matricula = keyboard.nextLine();

            System.out.println("Email");
            String email = keyboard.nextLine();

            Participante participante = new Participante(vinculo, nome, matricula, email);

            Palestra.inscreveParticipante(participante, evento);

            System.out.println("Cadastrar proximo participante? (nao)");
            String entrada = keyboard.nextLine();
            if (entrada.equals("nao")) {
                break;
            }
        }
    }

}
