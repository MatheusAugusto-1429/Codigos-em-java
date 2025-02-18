import java.util.Scanner;
public class Aplicacao{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        Biblioteca B1 = new Biblioteca("BIBLIOTECA");

        while (true) { 
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Exibir Livros");
            System.out.println("3. Exibir Livros por Ano");
            System.out.println("4. Remover Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
        
            switch (opcao) {
                //PRONTO
                case 1 -> {
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine(); 
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine(); 
                    System.out.print("Digite o ano de publicação (ou pressione Enter para usar 2024): ");
                    String anoStr = scanner.nextLine(); 
            
                    Livro livro = anoStr.isEmpty() ? new Livro(titulo, autor) : new Livro(titulo, autor, Integer.parseInt(anoStr));
                    B1.adicionarLivro(livro);
                }
                
                //PRONTO
                case 2 -> {
                    System.out.println("Livros cadastrados: ");
                    System.out.println("------------------------");
                    B1.exibirLivrosComAno(); 
                }

                case 3 -> {
                    System.out.print("Escolha o ano que você quer: ");
                    int escolheuAno = scanner.nextInt();
                    System.out.println("Livros publicados em " + escolheuAno +":");
                    System.out.println("------------------------");
                    B1.exibirLivrosColocandoAno(escolheuAno); 
                }
                case 4 -> {
                    System.out.print("Digite o título do livro que quer remover: ");
                    String tituloParaRemover = scanner.nextLine();
                    B1.removerLivro(tituloParaRemover);
                }
                case 5 -> {
                    System.out.println("Saindo");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Insira opção válida!");
            }

        }
    }
}