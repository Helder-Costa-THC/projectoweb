package escola;

import java.util.Date;

/**
 *
 * @author HelderD
 */
public class Aluno extends Pessoa{
    private Date dataNascimento;
    
    //Representacao de um 1 ver UML
    private Turma turma;
    
    //metodo sem retorno
   public void realizarAvaliacao(){
        
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
}
