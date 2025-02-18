public class Veiculo {
    private String modelo;
    private int ano;
    private final int capacidadeTanque;
    private int litrosTanque;

    public Veiculo(String modelo, int ano, int capacidadeTanque, int litrosTanque){
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeTanque = capacidadeTanque;
        this.litrosTanque = litrosTanque;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public int getLitrosTanque(){
        return litrosTanque;
    }
    public void setLitrosTanque(int litrosTanque){
        this.litrosTanque = litrosTanque;
    }

    public String statusVeiculo(){
        return "\nModelo: " + getModelo() + " \nAno: " + getAno() + " \nCapacidade do tanque: " + getCapacidadeTanque();
    }

    public void autoAbastecer(){
        int restante = capacidadeTanque - litrosTanque;
        litrosTanque += restante;
    }

    public void abastecer(int litros){
        int restante = capacidadeTanque - litrosTanque;
        if (litros > restante){
            litrosTanque += restante;
        }else{
            litrosTanque += litros;
        }
    }

    public String resumoVeiculo() {
        return "Modelo: " + modelo + " | Ano: " + ano;
    }
}
