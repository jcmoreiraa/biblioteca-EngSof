/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mauri
 */
import java.util.Calendar;
import java.util.Date;

public class Emprestimo {

    private final Livro livro;
    // private final Exemplar exemplar;
    private final Usuario usuario;
    private final Date dataEmprestimo;
    private final Date dataDevolucao;
    private final String estado;

    public Emprestimo(Livro livro, Usuario usuario) {
      // this.exemplar = exemplar;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = new Date();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEmprestimo);
        calendar.add(Calendar.DAY_OF_YEAR, usuario.getPrazoDoEmprestimo());
        this.dataDevolucao = calendar.getTime(); 
        this.estado = "corrente";
    }

    public String getEstado() {
      return this.estado;
    }

    public Livro getLivro() {
      return this.livro;
    }

    public Date getDataDevolucao() {
      return this.dataDevolucao;
    }
}
