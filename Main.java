import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstance();
        biblioteca.adicionarUsuario(new AlunoGraduacao(123, "João da Silva"));
        biblioteca.adicionarUsuario(new Professor(100, "Carlos Lucena"));
        
        Livro livro = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommerville", 6, 2000);
        livro.adicionarExemplar(new Exemplar(1));
        biblioteca.adicionarLivro(livro);
        
        Comandos gerenciador = new Comandos(biblioteca);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String comando = scanner.nextLine();
            if (comando.equals("sai")) break;
            gerenciador.executarComando(comando);
        }
        scanner.close();
    }
}
