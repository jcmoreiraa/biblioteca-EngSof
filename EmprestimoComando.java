
public class EmprestimoComando implements Comando {

    private final Biblioteca biblioteca;

    public EmprestimoComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int userId = Integer.parseInt(parametros[1]);
        int livroId = Integer.parseInt(parametros[2]);
        Usuario usuario = biblioteca.buscarUsuario(userId);
        Livro livro = biblioteca.buscarLivro(livroId);

        if (usuario != null && livro != null) {
            for (Exemplar exemplar : livro.getExemplares()) {
                if (exemplar.taDisponivel()) {
                    exemplar.emprestar();
                    Emprestimo emprestimo = new Emprestimo(livro, usuario);
                    usuario.livrosEmprestados.add(emprestimo);
                    System.out.println("Usuario" + usuario.getNome() + "recebeu " + livro);

                    livro.removerReserva(usuario);
                    System.out.println(usuario.getNome() + "Emprestou" + livro.getTitulo());
                    return;
                }
                System.out.println("Nenhum disponivel");
            }
        } else {
            System.out.println("Usuário ou Livro não encontrado");
        }
    }

}
