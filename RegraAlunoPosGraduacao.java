public class RegraAlunoPosGraduacao implements RegraEmprestimo{

    @Override
    public boolean podeEmprestar(Usuario usuario, Livro livro) {
        return usuario.getLivrosEmprestados().size() < 3 && !usuario.temLivroEmprestado(livro) && !usuario.temAtraso();


    }
    
}
