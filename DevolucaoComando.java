public class DevolucaoComando implements Comando {

    private final Biblioteca biblioteca;

    public DevolucaoComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        int userId = Integer.parseInt(parametros[1]);
        int livroId = Integer.parseInt(parametros[2]);
        Usuario usuario = biblioteca.buscarUsuario(userId);
        Livro livro = biblioteca.buscarLivro(livroId);

        if (usuario != null && livro != null) {
            for (Exemplar exemplar : livro.getExemplares()) {
                if (!exemplar.taDisponivel()) {
                    exemplar.devolver();  

                    Emprestimo emprestimo = null;
                    for (Emprestimo e : usuario.livrosEmprestados) {
                        if (e.getLivro().equals(livro)) {
                            emprestimo = e;
                            break;
                        }
                    }

                    if (emprestimo != null) {
                        usuario.livrosEmprestados.remove(emprestimo);
                        System.out.println("Livros emprestados antes da devolução:");
                        for (Emprestimo e : usuario.livrosEmprestados) {
                            System.out.println("- " + e.getLivro().getTitulo());
                        }
                        
                        System.out.println(usuario.getNome() + " devolveu " + livro.getTitulo());
                    } else {
                        System.out.println("Empréstimo não encontrado.");
                    }

                    return;  
                }
            }
            System.out.println("Esse livro não estava emprestado.");
        } else {
            System.out.println("Usuário ou Livro não encontrado.");
        }
    }
}
