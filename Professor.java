
public class Professor extends Usuario implements Observer {

    private int notificacoes;

    public Professor(int codigo, String nome) {
        super(codigo, nome);
        this.notificacoes = 0;
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getPrazoDoEmprestimo() {
        // TODO Auto-generated method stub
        return 8;
    }

    @Override
    public int getLimiteDoEmprestimo() {
        // TODO Auto-generated method stub
        return 4;
    }

    public void receberNotificacao(Livro livro) {
        System.out.println("Professor " + getNome() + " foi notificado sobre o livro: " + livro.getTitulo());
        notificar();
    }

    @Override
    public void notificar() {
        this.notificacoes++;
    }

    @Override
    public int getNotificacoes() {
        return this.notificacoes;
    }
}
