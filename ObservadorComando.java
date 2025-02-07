
public class ObservadorComando implements Comando {

    private final Biblioteca biblioteca;

    public ObservadorComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int userId = Integer.parseInt(parametros[1]);
        int livroId = Integer.parseInt(parametros[2]);
        Usuario usuario = biblioteca.buscarUsuario(userId);
        Livro livro = biblioteca.buscarLivro(livroId);
        
        Professor professor = (Professor) usuario; 
        if (professor != null && livro != null) {
            livro.adicionarObservador(professor);
        }
    }

}
