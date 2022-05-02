package q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Evento {
    private Date dataHorarioInicio;
    private Date dataHorarioFim;
    ArrayList<Palestra> palestras = new ArrayList<Palestra>();
    static final Integer MAX = 1;
    static Scanner keyboard = new Scanner(System.in);

    Evento(Date dataHorarioInicio, Date dataHorarioFim) {
        if (Main.eventos.size() < Evento.MAX) {
            this.dataHorarioInicio = dataHorarioInicio;
            this.dataHorarioFim = dataHorarioFim;
            // Evento.palestras = palestras;
            Main.eventos.add(this);
        } else {
            System.out.println("Impossível adicionar evento");
        }
    }

    public Date getDataHorarioInicio() {
        return dataHorarioInicio;
    }

    public void setDataHorarioInicio(Date dataHorarioInicio) {
        this.dataHorarioInicio = dataHorarioInicio;
    }

    public Date getDataHorarioFim() {
        return dataHorarioFim;
    }

    public void setDataHorarioFim(Date dataHorarioFim) {
        this.dataHorarioFim = dataHorarioFim;
    }

    public ArrayList<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(ArrayList<Palestra> palestras) {
        this.palestras = palestras;
    }

    public static Evento criaEvento() throws ParseException {
        System.out.println("Primeiro vamos cadastrar o evento principal.");
        System.out.println("Inserir dia e hora de inicio");
        String inicio = keyboard.nextLine();
        Date dataInicio = new SimpleDateFormat("dd/MM/yyyy-hh").parse(inicio);

        System.out.println("Inserir dia e hora de término");
        String fim = keyboard.nextLine();
        Date dataFim = new SimpleDateFormat("dd/MM/yyyy-hh").parse(fim);

        Evento SemanaCompUFF = new Evento(dataInicio, dataFim);

        System.out.println("Evento " + SemanaCompUFF + "registrado");
        return SemanaCompUFF;
    }
}
