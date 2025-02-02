
public class Exemplar {
    private final int codigo;
    private boolean disponivel; 

    public Exemplar (int codigo) {
        this.codigo = codigo;
        this.disponivel = true;
    }


    public boolean taDisponivel(){
        return disponivel;
    }

    public void emprestar(){
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

}
