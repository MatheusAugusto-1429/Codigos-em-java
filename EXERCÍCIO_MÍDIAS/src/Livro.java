import java.util.ArrayList;

public class Livro extends Midia{
    private ArrayList <Autor> autores;
    private int numeroPaginas;
    
    
    public Livro(String titulo, int anoLancamento, String categoria, ArrayList <Autor> autores, int numeroPaginas){
        super(titulo,anoLancamento,categoria);
        this.autores = autores;
        this.numeroPaginas = numeroPaginas;
    }
    
    public ArrayList <Autor> getAutores(){
        return autores;
    }

    public void setAutores(ArrayList <Autor> autores){
        this.autores = autores;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String exibirInfo(){
        return "Autores: " + listarAutores() + "\nNúmero de páginas: " + getNumeroPaginas(); 
    }

    @Override
    public String tipoDeMidia(){
        return "Livro";
    }

    public final String exibirResumo(){
            return "Título: " + getTitulo() + ", Páginas: " + numeroPaginas;

    }

    public boolean validarLivro(int paginasMinimas){
        return numeroPaginas >= paginasMinimas;
    }

    public String listarAutores(){
        String retorno = "";
        for (int i = 0; i < autores.size(); i++) {
            if (i > 0) {
                retorno += ", ";  
            }
            retorno += autores.get(i).getNome();  
        }
        return retorno;
    }
}