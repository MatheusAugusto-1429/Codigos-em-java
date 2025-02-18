public abstract class Midia{
    private String titulo;
    private int anoLancamento;
    private String categoria;

    public Midia(String titulo, int anoLancamento, String categoria){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public abstract String exibirInfo();
    public abstract String tipoDeMidia();
}