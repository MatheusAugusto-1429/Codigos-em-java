public class Frota {
    private String nomeFrota;
    private Veiculo [] veiculos;
    private int contarVeiculos;

    public Frota(String nomeFrota){
        this.nomeFrota = nomeFrota;
        veiculos = new Veiculo [10];
        this.contarVeiculos = 0;
    }

    public void setVeiculo(Veiculo [] veiculos){
        this.veiculos = veiculos;
    }

    public String getNomeFrota(){
        return nomeFrota;
    }

    public void setNomeFrota(String nomeFrota){
        this.nomeFrota = nomeFrota;
    }

    public void adicionarVeiculo(Veiculo veiculo){
        if (contarVeiculos < veiculos.length){
            veiculos[contarVeiculos] = veiculo;
            contarVeiculos++;
        }else{
            System.out.println("Lista cheia");
        }
    }

    public String exibirVeiculos(){
        String listando = "\nFrota: " + getNomeFrota() + "\n";
        for (int i = 0 ; i < contarVeiculos ; i++){
            listando += veiculos[i].resumoVeiculo() + "\n";
        }
        return listando;
    }
}
