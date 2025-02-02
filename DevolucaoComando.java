public class DevolucaoComando implements Comando {

    private final Biblioteca biblioteca;

    public DevolucaoComando(Biblioteca biblioteca){
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
            for (Exemplar exemplar: livro.getExemplares())
            {
                if (!exemplar.taDisponivel()){
                    exemplar.devolver();
                    System.out.println(usuario.getNome() + "devolveu" + livro.getTitulo());
                    return;
                }
                System.out.println("Esse livro n tava emprestado");
            }
        }
        else {
            System.out.println("Usuário ou Livro não encontrado");
        }
    }
    
}
