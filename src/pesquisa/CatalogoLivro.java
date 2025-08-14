package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList ){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("livro 2", "Autor 2", 2010);
        catalogoLivro.adicionarLivro("livro 2", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("livro 4", "Autor 2", 2015);
        catalogoLivro.adicionarLivro("livro 5", "Autor 5", 2013);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
        System.out.println("======================================");
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2011,2020));
        System.out.println("======================================");
        System.out.println(catalogoLivro.pesquisarPorTitulo("livro 2"));
    }
}
