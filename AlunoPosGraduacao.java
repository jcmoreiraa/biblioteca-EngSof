public class AlunoPosGraduacao extends Usuario {

    public AlunoPosGraduacao(int codigo, String nome) {
            super(codigo, nome);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public int getPrazoDoEmprestimo() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public int getLimiteDoEmprestimo() {
        // TODO Auto-generated method stub
        return 3;
    }
    
}
