
public class LivroComando implements Comando {

    private final Biblioteca biblioteca;

    public LivroComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int livroId = Integer.parseInt(parametros[1]);
        Livro livro = biblioteca.buscarLivro(livroId);
        String usuariosStr = "";
        String exemplaresStr = "";

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Quantidade de reservas: " + livro.getReservas().size());
        if (!livro.getReservas().isEmpty()) {
            for (Usuario usuario : livro.getReservas()) {
                usuariosStr += usuario.getNome() + ", ";
            }
        }
        for (Exemplar exemplar : livro.getExemplares()) {
            String status = exemplar.taDisponivel() ? "Disponivel" : "Indisponivel";
            exemplaresStr += exemplar.getCodigo() + " - " + status + ", ";
        }
        System.out.println("Usuários que reservaram: " + usuariosStr);
        System.out.println("Exemplares: " + exemplaresStr);
    }

}
