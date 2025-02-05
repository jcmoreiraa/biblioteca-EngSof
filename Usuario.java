import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Usuario {
    protected final int codigo;
    protected final String nome;
    protected List<Emprestimo> historicoDeEmprestimos;
    protected List<Emprestimo> livrosEmprestados;
    protected Map<Livro, Date> livrosReservados;
    protected boolean atrasado;
    protected boolean temLivroEmprestado;

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.historicoDeEmprestimos = new ArrayList<>();
        this.livrosEmprestados = new ArrayList<>();
        this.livrosReservados = new HashMap<>();
        this.atrasado = false;
        this.temLivroEmprestado = false; 
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome; 
    }

    public List<Emprestimo> getHistoricoDeEmprestimos() {
        return historicoDeEmprestimos;
    }

    public List<Emprestimo> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public Map<Livro, Date> getLivrosReservados() {
        return livrosReservados;
    }

    public boolean temAtraso() { 
        Date hoje = new Date();
        for (Emprestimo emprestimo : livrosEmprestados) {
            if (emprestimo.getEstado().equals("corrente") && hoje.after(emprestimo.getDataDevolucao())) {
                setAtraso(true);
                return true;
            }
        }
        return false;
    }

    public void setAtraso(boolean atraso) { 
        this.atrasado = atraso; 
    }

    public boolean temLivroEmprestado(Livro livro) {
        boolean temLivro = false;

        for (Emprestimo emprestimoProcura : livrosEmprestados) {
            if (livro.equals(emprestimoProcura.getLivro())) {
                temLivro = true;
                break; 
            }
        }

        return temLivro;
    }

    public abstract int getPrazoDoEmprestimo();

    public abstract int getLimiteDoEmprestimo();
}
