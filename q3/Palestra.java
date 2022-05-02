package q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Palestra {
    private String titulo;
    private String nomePalestrante;
    private String local;
    private Date dataHorario;
    private String prazoDuracao;
    ArrayList<Participante> participantes = new ArrayList<Participante>();
    static final Integer MAX = 20;
    static Scanner keyboard = new Scanner(System.in);

    Palestra(String titulo, String nomePalestrante, String local, Date dataHorario, String prazoDuracao,
            Evento evento) {
        if (evento.palestras.size() < Palestra.MAX) {
            this.titulo = titulo;
            this.nomePalestrante = nomePalestrante;
            this.local = local;
            this.dataHorario = dataHorario;
            this.prazoDuracao = prazoDuracao;
            // Palestra.participantes = participantes;
            evento.palestras.add(this);
        } else {
            System.out.println("Impossível adicionar palestra");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getPrazoDuracao() {
        return prazoDuracao;
    }

    public void setPrazoDuracao(String prazoDuracao) {
        this.prazoDuracao = prazoDuracao;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public static void cadastraPalestra(Evento evento) throws ParseException {
        while (true) {
            System.out.println("Em segundo vamos cadastrar as palestras (Max 20)");
            System.out.println("Título");
            String titulo = keyboard.nextLine();

            System.out.println("Palestrante");
            String palestrante = keyboard.nextLine();

            System.out.println("Local");
            String local = keyboard.nextLine();

            System.out.println("dia e hora (dd/MM/yyyy-hh)");
            String inicio = keyboard.nextLine();
            Date dataInicio = new SimpleDateFormat("dd/MM/yyyy-hh").parse(inicio);

            System.out.println("Duração");
            String duracao = keyboard.nextLine();

            Palestra palestra = new Palestra(titulo, palestrante, local, dataInicio, duracao, evento);

            System.out.println("Evento " + palestra.getTitulo() + " registrado");

            System.out.println("Cadastrar proxima palestra? (nao)");
            String entrada = keyboard.nextLine();
            if (entrada.equals("nao")) {
                break;
            }
        }
    }

    public static void inscreveParticipante(Participante participante, Evento evento) {
        while (true) {
            System.out.println("O participante gostaria de se inscrever em quais palestras?");
            System.out.println(evento.palestras);
            evento.palestras.forEach((palestra) -> {
                System.out.println(evento.palestras.indexOf(palestra) + ". " + palestra.getTitulo());
            });
            System.out.println("Digite o index da palestra");
            Integer index = keyboard.nextInt();

            evento.palestras.get(index).participantes.add(participante);

            System.out.println("Inscrever em mais uma? (nao)");
            String entrada = keyboard.nextLine();
            if (entrada.equals("nao")) {
                break;
            }
        }
        System.out.println("O participante " + participante.getNome() + " está inscrito nas palestas: ");
        evento.palestras.forEach((palestra) -> {
            if (palestra.participantes.contains(participante)) {
                System.out.println(palestra.getTitulo());
            }
        });
    }

    public static void imprimeInfos(Evento evento) {
        evento.palestras.forEach((palestra) -> {
            System.out.println(evento.palestras.indexOf(palestra) + ". " + palestra.getTitulo());
            System.out.println(" . " + palestra.getNomePalestrante());
            System.out.println(" . " + palestra.getLocal());
            System.out.println(" . " + palestra.getDataHorario());
            System.out.println(" . " + palestra.getPrazoDuracao());

            palestra.participantes.forEach((participante) -> {
                System.out.println("Participantes inscritos");
                System.out.println(participante.getNome());
            });
        });
    }
}
