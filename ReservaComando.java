public class ReservaComando implements Comando {

    private final Biblioteca biblioteca;

    public ReservaComando(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }
    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int userId = Integer.parseInt(parametros[1]);
        int livroId = Integer.parseInt(parametros[2]);
        Usuario usuario = biblioteca.buscarUsuario(userId);
        Livro livro = biblioteca.buscarLivro(livroId);


        if (usuario != null && livro != null){
            livro.adicionarReserva(usuario);
        }
        else {
            System.out.println("Usuário ou Livro não encontrado");
        }
    }
    
}
