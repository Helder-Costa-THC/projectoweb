package escola;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author HelderD
 */
public class Disciplina {

    private String nome;
    private int cargaHoraria;

//Representacao de muitos no uml    
    private ArrayList<Professor> professores;

    private ArrayList<Turma> turmas;

    public Disciplina() {
        professores = new ArrayList<Professor>();
    }

    public void adicionarProfessores(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        //proteccao de valores
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

    public boolean salvar() {
        try {
            ArrayList<Disciplina> vetDisciplinas = Disciplina.listar();

            vetDisciplinas.add(this);

            XStream xstream = new XStream();
            xstream.alias("disciplina", Disciplina.class);

            FileWriter escritor = new FileWriter(Conexao.getCaminho() + "disciplinas.xml");
            escritor.write(xstream.toXML(vetDisciplinas));
            escritor.close();

            return true;
        } catch (Exception excecao) {
            System.out.println("Exceção!" + excecao.getMessage());
            return false;
        }
    }

    public static ArrayList<Disciplina> listar() {
        ArrayList<Disciplina> vetDisciplinas = new ArrayList<Disciplina>();

        XStream leitor = new XStream();
        leitor.alias("disciplina", Disciplina.class);
        File arquivo = new File(Conexao.getCaminho() + "disciplinas.xml");
        if (arquivo.exists()) {
            vetDisciplinas = (ArrayList<Disciplina>) leitor.fromXML(arquivo);
        }
        return vetDisciplinas;
    }

}
