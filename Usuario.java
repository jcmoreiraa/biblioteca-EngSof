import java.util.ArrayList;
import java.util.List;

abstract class Usuario {
    protected final int codigo;
    protected final String nome;
    protected List<Livro> livrosEmprestados;
    protected boolean atrasado;
    protected boolean temLivroEmprestado;

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
        this.atrasado = false;
        this.temLivroEmprestado = false; 
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome; 
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean temAtraso() { 
        return atrasado; 
    }

    public void setAtraso(boolean atraso) { 
        this.atrasado = atraso; 
    }

    public boolean temLivroEmprestado(Livro livro) {
        boolean temLivro = false;

        for (Livro livroProcura : livrosEmprestados) {
            if (livro.equals(livroProcura)) {
                temLivro = true;
                break; 
            }
        }

        return temLivro;
    }

    public abstract int getPrazoDoEmprestimo();

    public abstract int getLimiteDoEmprestimo();
}
