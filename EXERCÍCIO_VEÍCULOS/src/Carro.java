public class Carro extends Veiculo {
    private Motor motor;

    public Carro(String modelo, int ano, int capacidadeTanque, int litrosTanque, Motor motor) {
        super(modelo, ano, capacidadeTanque, litrosTanque);
        this.motor = motor;
    }

    public void setMotor (Motor motor){
        this.motor = motor;
    }
    
    @Override
    public String statusVeiculo() {
        return super.statusVeiculo() + "\n" + motor.detalhesMotor();
    }
}