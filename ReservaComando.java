import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

public class ReservaComando implements Comando {

    private final Biblioteca biblioteca;

    public ReservaComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        int userId = Integer.parseInt(parametros[1]);
        int livroId = Integer.parseInt(parametros[2]);
        Usuario usuario = biblioteca.buscarUsuario(userId);
        Livro livro = biblioteca.buscarLivro(livroId);

        if (usuario != null && livro != null) {
            livro.adicionarReserva(usuario);
            
            System.out.println("Livros reservados por " + usuario.getNome() + ":");
            for (Entry<Livro, Date> entry : usuario.livrosReservados.entrySet()) {
                Livro livroReservado = entry.getKey();
                
                System.out.println(livroReservado.getTitulo());
                break;  
            }
        } else {
            System.out.println("Usuário ou Livro não encontrado");
        }
    }
}
