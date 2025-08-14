package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private  Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l, "fralda", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "bebida", 20d, 34);
        cadastroProdutos.adicionarProduto(3l, "terra", 10d, 10);
        cadastroProdutos.adicionarProduto(4l, "carne", 2d, 52);
        System.out.println("=====================================================================");
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("=====================================================================");
        System.out.println(cadastroProdutos.exibirPorPreco());
        System.out.println("=====================================================================");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println("=====================================================================");


    }
}
