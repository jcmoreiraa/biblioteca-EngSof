public class RegraProfessor implements RegraEmprestimo {

    @Override
    public boolean podeEmprestar(Usuario usuario, Livro livro) {
        return !usuario.temLivroEmprestado(livro);
    }
    
}
