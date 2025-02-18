public class Animal{
    private String nome;
    private int idade;
    private String dieta;


    public Animal(String nome, int idade, String dieta){
        this.nome = nome;
        this.idade = idade;
        this.dieta = dieta;
    }


    public String getNome(){
        return nome;
    }


    public int getIdade(){
        return idade;
    }


    public String getDieta(){
        return dieta;
    }


    public void setNome(String nome){
        this.nome = nome;
    }


    public void setIdade(int idade){
        this.idade = idade;
    }


    public void setDieta(String dieta){
        this.dieta = dieta;
    }


    public String exibirInfo(){
        return "--------------------------------\nNome: " + getNome() + "\n" + "Idade: " + getIdade();
    }


    public String exibirHabitat(){
        return "Habitat: ";
    }
   
    public String showHabitat(){
        return "-> ";
    }
}

