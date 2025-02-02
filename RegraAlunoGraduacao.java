public class RegraAlunoGraduacao implements RegraEmprestimo{

    @Override
    public boolean podeEmprestar(Usuario usuario, Livro livro) {
        return usuario.getLivrosEmprestados().size() < 2 && !usuario.temLivroEmprestado(livro) && !usuario.temAtraso();
    }
    
}
