import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private static Biblioteca instancia;
    private final Map<Integer, Livro> livros;
    private final Map<Integer, Usuario> usuarios;
    

    private Biblioteca(){
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public static Biblioteca getInstance(){
        if (instancia == null){
            instancia = new Biblioteca();
        }
        return instancia;
    }


    public void adicionarLivro(Livro livro) { 
        livros.put(livro.getCodigo(), livro); 
    }

    public void adicionarUsuario(Usuario usuario) {
         usuarios.put(usuario.getCodigo(), usuario); 
        }

    public Livro buscarLivro(int codigo) {
         return livros.get(codigo); 
    }
    
    public Usuario buscarUsuario(int codigo) {
         return usuarios.get(codigo); 
        }
    
}
