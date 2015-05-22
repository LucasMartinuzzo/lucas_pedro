package model.pojo;

/**
 *
 * @author Filipe
 */
public class Nota implements Comparable<Nota>{
    private String id;
    private Double nota;
    private Aluno aluno;
    private Atividade atividade;

    public Nota (String id, Double nota, Aluno aluno, Atividade atividade){
        this.id = id;
        this.nota = nota;
        this.aluno = aluno;
        this.atividade = atividade;
    }
    
    public String getId (){
        return id;
    }
    
    public Double getNota(){
        return nota;
    }
    
    public void setNota(Double nota){
        this.nota = nota;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    
    public void setAluno(Object obj){
        Aluno aluno = (Aluno) obj;
        this.aluno = aluno;
    }
    
    public Atividade getAtividade(){
        return atividade;
    }
    
    public void setAtividade(Object obj){
        Atividade atividade = (Atividade) obj;
        this.atividade = atividade;
    }
    
    @Override
    public int compareTo (Nota nota){
        return this.id.compareTo(nota.id);
    }
    @Override
    public String toString () {
        return ("ID: " + this.id + "\nNotas: " + this.nota + "\nAluno: " 
                + this.aluno.getNome() + "\nAtividade: " + atividade.getNome() 
                + "("+atividade.getTipo()+")" + "\n");
    }    
}
