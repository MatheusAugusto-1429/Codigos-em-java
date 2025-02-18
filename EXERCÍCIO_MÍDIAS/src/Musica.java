public class Musica extends Midia {
    private String artista; 
    private String generoMusical;

    public Musica(String titulo, int anoLancamento, String categoria,String artista, String generoMusical){
        super(titulo,anoLancamento,categoria);
        this.artista = artista;
        this.generoMusical = generoMusical;
    }


    public String getArtista(){
        return artista;
    }
    public String getGeneroMusical(){
        return generoMusical;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setGeneroMusical(String generoMusical){
        this.generoMusical = generoMusical;
    }

    @Override
    public String exibirInfo(){
        return "Artista: " + getArtista() + " Gênero musical: " + getGeneroMusical();
    }

    @Override
    public String tipoDeMidia(){
        return "Música";
    }
}
