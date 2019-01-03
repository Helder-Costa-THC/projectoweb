package escola;

import java.util.ArrayList;

/**
 *
 * @author HelderD
 */
public class Turma {
    private String sigla;
    private int ano;
    //Representacao de muitos 1*
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    
    public Turma(){
        alunos = new ArrayList<Aluno>();
    }
    //metodos sem retorno inserir no DAO
   public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);        
    }
   public int quantidadeAlunos(){
       return alunos.size();
   }
   public void excluirAluno(Aluno aluno){
        alunos.remove(aluno);     
   }
   public Aluno getAluno(int posicao){
       return alunos.get(posicao);
       
   }
   
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
