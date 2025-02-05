
import java.util.Date;
import java.util.Map;

public class UsuarioComando implements Comando {

    private final Biblioteca biblioteca;

    public UsuarioComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int userId = Integer.parseInt(parametros[1]);
        Usuario usuario = biblioteca.buscarUsuario(userId);

        if (usuario != null) {
            for (Emprestimo emprestimo : usuario.getHistoricoDeEmprestimos()) {
                System.out.println("Título: " + emprestimo.getLivro().getTitulo());
                System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
                System.out.println("Estado do empréstimo: " + emprestimo.getEstado());
                System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());
                System.out.println("----------------------------------------");
            }

            for (Map.Entry<Livro, Date> entrada : usuario.getLivrosReservados().entrySet()) {
                Livro livro = entrada.getKey();
                Date data = entrada.getValue();

                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Data da solicitação: " + data);
                System.out.println("----------------------------------------");
            };
        }
    }

}
