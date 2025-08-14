package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgentaContatos {
    private Set<Contato> contatoSet;

    public AgentaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoesPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoesPorNome.add(c);
            }
        }
        return contatoesPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgentaContatos agentaContatos = new AgentaContatos();

        agentaContatos.exibirContatos();
        agentaContatos.adicionarContato("fernando", 123);
        agentaContatos.adicionarContato("denise", 456);
        agentaContatos.adicionarContato("marta", 789);
        agentaContatos.adicionarContato("rafa", 123);
        agentaContatos.adicionarContato("mario", 135);
        agentaContatos.exibirContatos();
    }
}
