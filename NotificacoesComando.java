
public class NotificacoesComando implements Comando {

    private final Biblioteca biblioteca;

    public NotificacoesComando(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar(String[] parametros) {
        // TODO Auto-generated method stub
        int userId = Integer.parseInt(parametros[1]);
        Usuario usuario = biblioteca.buscarUsuario(userId);

        if (usuario != null) {
            Professor professor = (Professor) usuario;
            int notificacoes = professor.getNotificacoes();
            System.out.println("Número de notificações recebidas:" + notificacoes);
        }
    }

}
