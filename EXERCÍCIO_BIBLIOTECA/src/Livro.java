public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private final int codigoLivro;
    private static int contador = 0;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.codigoLivro = ++contador;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 2024;
        this.codigoLivro = ++contador; // Inicializando codigoLivro
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public String exibirDetalhesLivro(){
        return "Título: " + getTitulo() + " Autor: " + getAutor();
    }

    public void exibirDetalhes(boolean anoShow){
        System.out.println(exibirDetalhesLivro());
        if (anoShow){
            System.out.println("Ano de publicação: " + getAnoPublicacao());
        }else{
            System.err.println("Não encontrado");
        }
    }
}