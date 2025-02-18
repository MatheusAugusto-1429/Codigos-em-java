import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {
        Biblioteca B1 = new Biblioteca("Biblioteca CentrSDSDall");
        Autor A1 = new Autor("Jaozin", 2010);
        Autor A2 = new Autor("Pedrin", 2011);
        ArrayList<Autor> autoresLivro = new ArrayList<>();
        autoresLivro.add(A1);
        autoresLivro.add(A2);

        Livro L1 = new Livro("Livro 1", 2010, "Ficção", autoresLivro, 300);
        Filme F1 = new Filme("Filme 1", 2020, "Terror", "Zezin", 120);
        Musica M1 = new Musica("Música 1", 2015, "Anos 80", "Junin", "Pop");

        B1.adicionarMidia(L1);
        B1.adicionarMidia(F1);
        B1.adicionarMidia(M1);

        System.out.println(B1.listarMidias());
        System.out.println("");

        System.out.println(B1.exibirDetalhesMidia("Livro 1"));
        System.out.println("");

        System.out.println(B1.contarMidiasPorAno(2010));
        System.out.println("");

        System.out.println(Utilidades.exibirPorCategoria(B1.getColecaoMidias(), "Ficção"));
        System.out.println("");

        System.out.println("Autores: " + L1.listarAutores());
        System.out.println("");
    }
}
