public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String modelo, int ano, int capacidadeTanque, int litrosTanque, int capacidadeCarga) {
        super(modelo, ano, capacidadeTanque, litrosTanque);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String statusVeiculo() {
        return super.statusVeiculo() + "\nCapacidade de Carga: " + capacidadeCarga + "kg";
    }
}
