package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {this.eventoMap = new HashMap<>();}

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);

    }
    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.OCTOBER, 15), "evento 1", "festa");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 10), "evento 2", "Show");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 10), "evento 00", "Show");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.OCTOBER, 11), "evento 3", "Musica ao vivo");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 20), "evento 4", "Corrida");
        System.out.println("======================================");
        agendaEventos.exibirAgenda();
        System.out.println("======================================");
        agendaEventos.obterProximoEvento();

    }

}
