
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstance();
        AlunoGraduacao aluno = new AlunoGraduacao(123, "João da Silva");
        System.out.println(aluno.getLimiteDoEmprestimo());
        biblioteca.adicionarUsuario(new AlunoGraduacao(123, "João da Silva"));
        biblioteca.adicionarUsuario(new AlunoGraduacao(789, "Pedro Paulo"));
        biblioteca.adicionarUsuario(new AlunoPosGraduacao(456, "Luiz Fernando Rodrigues"));
        biblioteca.adicionarUsuario(new Professor(100, "Carlos Lucena"));

        Livro livro = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommerville", 6, 2000);
        livro.adicionarExemplar(new Exemplar(1));
        Livro livro2 = new Livro(101, "Engenharia de Software2", "Addison Wesley", "Ian Sommerville", 6, 2000);
        livro2.adicionarExemplar(new Exemplar(1));
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);

        Comandos gerenciador = new Comandos(biblioteca);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String comando = scanner.nextLine();
            if (comando.equals("sai")) {
                break;
            }
            gerenciador.executarComando(comando);
            System.out.println(aluno.getLivrosEmprestados());

        }
        scanner.close();

    }

}
