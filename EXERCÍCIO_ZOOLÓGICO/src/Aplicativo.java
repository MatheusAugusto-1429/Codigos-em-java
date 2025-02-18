public class Aplicativo{
    public static void main (String [] args){
        Ave A1 = new Ave("Águia", 30, "Carnívora", true);
        Ave A2 = new Ave("Canário",6,"Herbívora",false);
        Mamifero M1 = new Mamifero("Macaco", 3, "Herbívora", 1);
        Mamifero M2 = new Mamifero("Leão", 12, "Carnívora", 2);
        Mamifero M3 = new Mamifero("Ser humano", 30, "Churrasco", 9);
        Zoo Z1 = new Zoo("Zoológico A");

        Z1.adicionarAnimal(A1);
        Z1.adicionarAnimal(A2);
        Z1.adicionarAnimal(M1);
        Z1.adicionarAnimal(M2);
        Z1.adicionarAnimal(M3);
        
        System.out.println(A1.exibirInfo());
        System.out.println(A1.exibirHabitat());

        System.out.println(A2.exibirInfo());
        System.out.println(A2.exibirHabitat());

        System.out.println(M1.exibirInfo());
        System.out.println(M1.exibirHabitat());

        System.out.println(M2.exibirInfo());
        System.out.println(M2.exibirHabitat());

        System.out.println(M3.exibirInfo());
        System.out.println(M3.exibirHabitat());

        System.out.println("");
        System.out.println(Z1.exibirHabitats());
        System.out.println(Z1.exibirMamiferosGestacaoCurta());
    }
}
