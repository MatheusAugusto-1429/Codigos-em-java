public class Zoo{
    private String nomeZoo;
    private Animal [] animais;
    private int contador;


    public Zoo(String nomeZoo){
        this.nomeZoo = nomeZoo;
        animais = new Animal [10];
        this.contador = 0;
    }


    public String getNomeZoo(){
        return nomeZoo;
    }


    public void setNomeZoo(String nomeZoo){
        this.nomeZoo = nomeZoo;
    }


    public int getContador(){
        return contador;
    }


    public void setContador(int Contador){
        this.contador = 0;
    }


    public void setAnimais(Animal [] animais){
        this.animais = animais;
    }

    public void adicionarAnimal (Animal animal){
        if (contador < animais.length){
            animais[contador] = animal;
            contador++;
        }else{
            System.out.println("Não há mais espaço");
        }
    }
    
    public String exibirTodosAnimais(){
        String listando = "Zoológico: " + getNomeZoo();
        for (int i = 0 ; i < contador ; i++){
            listando += animais[i].toString();
        }
        return listando;
    }

    public String exibirHabitats() {
        String texto = "Habitats:\n"; 
        for (int i = 0; i < contador; i++) {  
            texto += animais[i].showHabitat() + "\n"; 
        }
        return texto; 
    }

    public String exibirMamiferosGestacaoCurta() {
        String listagem = "Mamíferos com gestação curta:\n";
        for (int i = 0; i < contador; i++) {
            if (animais[i] instanceof Mamifero mamifero) { 
                if (mamifero.getTempoGestacao() < 3) {
                    listagem += "-> " + mamifero.getNome() + "\n"; 
                }
            }
        }
        return listagem;
    }
}



