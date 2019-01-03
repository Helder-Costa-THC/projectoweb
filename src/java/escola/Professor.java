package escola;

import java.util.ArrayList;

/**
 *
 * @author HelderD
 * extends heranca
 */
public class Professor extends Pessoa{   
    private String formacaoAcademica;
    private double salario;

    //Representacao de muitos
   private ArrayList<Disciplina> disciplinas;
   private ArrayList<Turma> turmas;
    //metodo sem retorno
   public void aplicarAvalicao(){
       
   }   
   //Metodo construtor
   public Professor(){
       disciplinas = new ArrayList<Disciplina>();
   }
   //criacao de metodos DAO
   public void adicionarDisciplinas(Disciplina disciplina){
       disciplinas.add(disciplina);
   }
   public void excluirDisciplinas(Disciplina disciplina){
       disciplinas.remove(disciplina);
   }
   public int quantidadeDisciplinas(){
       return disciplinas.size();
   }
   public Disciplina getDisciplinas(int posicao){
       return disciplinas.get(posicao);
   }
   
    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
    
}
