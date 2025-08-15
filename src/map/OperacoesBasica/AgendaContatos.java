package map.OperacoesBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void remContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("fernando", 123);
        agendaContatos.addContato("fernando", 3132);
        agendaContatos.addContato("augusto", 234);
        agendaContatos.addContato("joao", 456);
        agendaContatos.addContato("leonice", 123);

        agendaContatos.exibirContatos();
    }
}
