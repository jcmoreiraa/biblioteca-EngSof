import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private static Biblioteca instancia;
    private final Map<Integer, Livro> livros;
    private final Map<Integer, Usuario> usuarios;
    private final Map<Integer, Integer> notificacoesProfessores;

    
    

    private Biblioteca(){
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.notificacoesProfessores = new HashMap<>();

    }

    public static Biblioteca getInstance(){
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }
    public void notificarProfessor(int professorId) {
        notificacoesProfessores.put(professorId, notificacoesProfessores.getOrDefault(professorId, 0) + 1);
    }
    
    public int getNotificacoesProfessor(int professorId) {
        return notificacoesProfessores.getOrDefault(professorId, 0);
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
