public class Filme extends Midia {
    private String diretor;
    private int duracao;

    public Filme(String titulo, int anoLancamento, String categoria, String diretor, int duracao){
        super(titulo,anoLancamento, categoria);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor(){
        return diretor;
    }
    public int getDuracao(){
        return duracao;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    @Override
    public String exibirInfo(){
        return "Diretor: " + getDiretor() + " Duração: " + getDuracao();
    }

    @Override
    public String tipoDeMidia(){
        return "Filme";
    }
}



