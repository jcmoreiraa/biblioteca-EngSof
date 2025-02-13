
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstance();
        AlunoGraduacao aluno = new AlunoGraduacao(123, "João da Silva");
        // System.out.println(aluno.getLimiteDoEmprestimo());
        biblioteca.adicionarUsuario(new AlunoGraduacao(123, "João da Silva"));
        biblioteca.adicionarUsuario(new AlunoPosGraduacao(456, "Luiz Fernando Rodrigues"));
        biblioteca.adicionarUsuario(new AlunoGraduacao(789, "Pedro Paulo"));
        biblioteca.adicionarUsuario(new Professor(100, "Carlos Lucena"));

        Livro livro = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommerville", 6, 2000);
        livro.adicionarExemplar(new Exemplar(1));
        livro.adicionarExemplar(new Exemplar(2));

        Livro livro2 = new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", 7, 2000);
        livro2.adicionarExemplar(new Exemplar(3));
        
        Livro livro3 = new Livro(200, "Code Complete", "Microsoft Press", "Steve McConnell", 2, 2014);
        livro3.adicionarExemplar(new Exemplar(4));

        Livro livro4 = new Livro(201, "Agile Software Development, Principles, Patterns and Practices", "Prentice Hall", "Robert Martin", 1, 2002);
        livro4.adicionarExemplar(new Exemplar(5));

        Livro livro5 = new Livro(300, "Refactoring: Improving the Design of Existing Code", "Addison Wesley Professional", "Martin Fowler", 1, 1999);
        livro5.adicionarExemplar(new Exemplar(6));
        livro5.adicionarExemplar(new Exemplar(7));

        Livro livro6 = new Livro(301, "Software Metrics: A rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", 3, 2014);

        Livro livro7 = new Livro(400, "Design Patterns: Element of Reusable Object-Oriented Software", "Addison Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson, J Vlissides", 1, 1994);
        livro7.adicionarExemplar(new Exemplar(8));
        livro7.adicionarExemplar(new Exemplar(9));

        Livro livro8 = new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional", "Martin Fowlern", 3, 2003);

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);

        Comandos gerenciador = new Comandos(biblioteca);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String comando = scanner.nextLine();
            if (comando.equals("sai")) {
                break;
            }
            gerenciador.executarComando(comando);
           // System.out.println(aluno.getLivrosEmprestados());

        }
        scanner.close();

    }

}
