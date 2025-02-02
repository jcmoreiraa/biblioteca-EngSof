import java.util.ArrayList;
import java.util.List;

abstract class Usuario {
    protected final int codigo;
    protected final String nome;
    protected final List<Livro> livrosEmprestados;

    public Usuario(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }


    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome; 
    }

    public abstract int getPrazoDoEmprestimo();

    public abstract int getLimiteDoEmprestimo();
}

