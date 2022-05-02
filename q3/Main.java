package q3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Evento> eventos = new ArrayList<Evento>();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Evento eventoPrincipal = Evento.criaEvento();
        Palestra.cadastraPalestra(eventoPrincipal);
        Participante.cadastraParticipante(eventoPrincipal);
        Palestra.imprimeInfos(eventoPrincipal);
    }
}
