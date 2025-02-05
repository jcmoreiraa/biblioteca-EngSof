
import java.util.*;

class Livro {

    private final int codigo;
    private final String titulo;
    private final String editora;
    private final String autor;
    private final int edicao;
    private final int ano;
    private final List<Exemplar> exemplares;
    private final Queue<Usuario> reservas;
    private final List<Usuario> observadores;

    public Livro(int codigo, String titulo, String editora, String autor, int edicao, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.exemplares = new ArrayList<>();
        this.reservas = new LinkedList<>();
        this.observadores = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public Queue<Usuario> getReservas() {
        return reservas;
    }

    public List<Usuario> getObservadores() {
        return observadores;
    }

    public void adicionarExemplar(Exemplar exemplar) {
        exemplares.add(exemplar);
    }

    public void adicionarObservador(Usuario observador) {
        observadores.add(observador);
        System.out.println(observador.getNome() + "está observando" + titulo);
    }

    public void adicionarUsuario(Usuario usuario) {
        if (reservas.size() < 3) {
            reservas.add(usuario);
            System.out.println(usuario.getNome() + "reservou" + titulo);
        } else {
            System.out.println("Não é possível reservar, limite foi atingido");
        }

    }

    public void removerUsuario(Usuario usuario) {
        reservas.remove(usuario);
    }

    public void adicionarReserva(Usuario usuario) {
        // TODO Auto-generated method stub
        if (reservas.size() < 3) {
            reservas.add(usuario);
            System.out.println(usuario.getNome() + " reservou " + titulo);
            if (reservas.size() == 3) {
                for (Usuario observador : observadores) {
                    if (observador instanceof Professor professor) {
                        professor.receberNotificacao(this);    
                    }
                }
            }
        } else {
            System.out.println("Não é possível reservar, limite foi atingido");
        }
    }

    public void removerReserva(Usuario usuario) {
        // TODO Auto-generated method stub
        if (reservas.contains(usuario)) {
            reservas.remove(usuario);
            System.out.println(usuario.getNome() + " teve sua reserva removida para " + titulo);
        } else {
            System.out.println("Reserva não encontrada para " + usuario.getNome());
        }
    }

}
