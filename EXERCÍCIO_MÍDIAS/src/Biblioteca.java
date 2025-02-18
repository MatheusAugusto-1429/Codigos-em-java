public class Biblioteca {
    private String nomeB;
    private Midia [] colecaoMidias;
    private int contador;
    public Biblioteca(String nomeB){
        this.nomeB = nomeB;
        this.colecaoMidias = new Midia [20];
    }
    public String getNomeB(){
        return nomeB;
    }
    public void setNomeB(String nomeB){
        this.nomeB = nomeB;
    }
    public Midia [] getColecaoMidias(){
        return colecaoMidias;
    }
    public void setColecaoMidias(Midia [] colecaoMidias){
        this.colecaoMidias = colecaoMidias;
    }

    public void adicionarMidia(Midia midia){
        if (contador<colecaoMidias.length){ 
            colecaoMidias[contador] = midia;
            contador++;
        }else{
            System.out.println("ACABOU O ESPAÇO");
        }
    }

    public String listarMidias(){
        String text = "";
        for (int i = 0; i < contador; i++) {
            text += colecaoMidias[i].getTitulo() + " (" + colecaoMidias[i].tipoDeMidia() + ")";
            if (i < contador - 1) { 
                text += "\n";
            }
        }
        return text;
    }

    public String exibirDetalhesMidia(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (colecaoMidias[i].getTitulo().equalsIgnoreCase(titulo)) {
                return "Detalhes do \"" + colecaoMidias[i].getTitulo() + "\": \n" + colecaoMidias[i].exibirInfo();  
            }
        }
        return "Mídia não encontrada";  
    }

    public String contarMidiasPorAno(int ano){
        int contando = 0;
        for (int i = 0; i < contador; i++){ 
            if (colecaoMidias[i].getAnoLancamento() == ano){
                contando++;
            }
        }
        return "Mídias do ano " + ano + ": " + contando;
    }
}
