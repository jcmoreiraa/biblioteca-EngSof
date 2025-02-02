public class AlunoGraduacao extends Usuario {

    public AlunoGraduacao(int codigo, String nome) {
            super(codigo, nome);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public int getPrazoDoEmprestimo() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public int getLimiteDoEmprestimo() {
        // TODO Auto-generated method stub
        return 2;
    }
    
}
