import java.util.ArrayList;
import java.util.Iterator;
public class Biblioteca{
    private String nome;
    private ArrayList <Livro> livros;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void SetLivros(ArrayList <Livro> livros){
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirLivrosComAno() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
            System.out.println("------------------------"); 
        }
    }

    public void exibirLivrosSemAno(){
        for (Livro livro: livros){
            livro.exibirDetalhes(false);
        }
    }

    public void exibirLivrosColocandoAno(int anoQueVcQuer){
        boolean encontrouLivro = false; 
    
        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() == anoQueVcQuer) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
                System.out.println("------------------------");
                encontrouLivro = true; 
            }
        }
    
        if (!encontrouLivro) {
            System.out.println("Nenhum livro encontrado para o ano " + anoQueVcQuer + ".");
        }
    }

    public void removerLivro(String tituloInserido) {
        Iterator<Livro> iterator = livros.iterator(); 
        while (iterator.hasNext()) {
            Livro livro = iterator.next(); 
            if (tituloInserido.equalsIgnoreCase(livro.getTitulo())) {
                iterator.remove(); 
                System.out.println("Livro removido com sucesso!");
                return; 
            }
        }
        System.out.println("Não encontrei");
    }
}