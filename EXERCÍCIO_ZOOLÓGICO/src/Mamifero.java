public class Mamifero extends Animal{
    private int tempoGestacao;


    public Mamifero(String nome, int idade, String dieta, int tempoGestacao){
        super(nome,idade,dieta);
        this.tempoGestacao = tempoGestacao;
    }


    public int getTempoGestacao(){
        return tempoGestacao;
    }


    public void setTempoGestacao(int tempoGestacao){
        this.tempoGestacao = tempoGestacao;
    }


    @Override
    public String exibirInfo(){
        return super.exibirInfo() + getTempoGestacao();
    }


    @Override
    public String exibirHabitat(){
        return super.exibirHabitat() + "Ambiente terreste";
    }

    @Override
    public String showHabitat(){
        return super.showHabitat() + "Ambiente terreste";
    }
}

