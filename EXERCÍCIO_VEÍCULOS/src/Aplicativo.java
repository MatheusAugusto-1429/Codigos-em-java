public class Aplicativo {
    public static void main(String[] args) {
        Motor M1 = new Motor("V8", 887);
        Carro C1 = new Carro("Porsche 918 spyder", 2016, 70, 70, M1);
        Caminhao T1 = new Caminhao("Scania 113 top line", 1998, 397, 397, 16000);
        Frota F1 = new Frota("Frota A");

        F1.adicionarVeiculo(C1);
        F1.adicionarVeiculo(T1);

        System.out.println(F1.exibirVeiculos());

        System.out.println(C1.statusVeiculo());
        System.out.println(T1.statusVeiculo());
    }
}