public class Professor extends Usuario {

    public Professor(int codigo, String nome) {
        super(codigo, nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getPrazoDoEmprestimo() {
        // TODO Auto-generated method stub
        return 2;
        }

    @Override
    public int getLimiteDoEmprestimo() {
        // TODO Auto-generated method stub
        return 4;
    }

   

   
    
}
