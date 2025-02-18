public class Autor{
    private String nome;
    private int anoNasc;

    public Autor(String nome, int anoNasc){
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnoNasc(){
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }

    public String exibirAutor(){
        return "\nNome: " + getNome() + "\nAno de nascimento: " + getAnoNasc();
    }

    public int calcularIdade(int anoAtual){
        return anoAtual-anoNasc;
    }
}


