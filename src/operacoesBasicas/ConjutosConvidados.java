package operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutosConvidados {
    private Set<Convidado> convidadoSet;

    public ConjutosConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome,codigoConvidado));
    }

    public void removerConvidado(int codigoConvidado){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvidado() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }else System.out.println("Convidado não encotrado");
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjutosConvidados conjutosConvidados = new ConjutosConvidados();
        System.out.println("Existem " + conjutosConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjutosConvidados.adicionarConvidado("convidado 1", 123);
        conjutosConvidados.adicionarConvidado("convidado 2", 123);
        conjutosConvidados.adicionarConvidado("convidado 3", 156);
        conjutosConvidados.adicionarConvidado("convidado 4", 178);
        conjutosConvidados.adicionarConvidado("convidado 5", 190);
        System.out.println("======================================");
        System.out.println("Existem " + conjutosConvidados.contarConvidados() + " dentro do Set de Convidados");
        System.out.println("======================================");
        conjutosConvidados.exibirConvidados();
    }

}
