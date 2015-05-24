package model.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mônicka
 */
public class Atividade implements Comparable<Atividade> {
    private String id;
    private String nome;
    private String tipo;
    private String data;
    private Double valor;
    private Boolean notasLancadas;
    private Turma turma;
    private List<Nota> nota = new ArrayList<>();
  
    public Atividade(String id, String nome, String tipo, String data, Double valor, Turma turma){
        this.id = id;
        this.data = data;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.notasLancadas = false;
        this.turma = turma;
    }
    
    public String getId () {
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public void setNotasLancadas(Boolean notasLancadas){
        this.notasLancadas = notasLancadas;
    }
    
    public void setTurma(Object obj){
        Turma turma = (Turma) obj;
        this.turma = turma;
    }
        
    public String getNome(){
        return nome;
    }
    
    public Double getValor(){
        return valor;
    }
    
    public String getData(){
        return data;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Turma getTurma(){
        return turma;
    }
    
    public List<Nota> getNota(){
        return nota;
    }
    
    public Boolean notasLancadas(){
        return notasLancadas;
    }   
       
    public Boolean adicionarNota(Nota nota){
        if (this.notasLancadas())
            return false;
        for (Nota notaConsultada: this.getNota()) {
            if (notaConsultada.getAluno().equals(nota.getAluno()))
                return false;
        }
        return this.getNota().add(nota);
    }
    
    public Boolean adicionarNotaArquivo(Nota nota){//Deve carregar as notas do arquivo mesmo se notasLançadas for true
        for (Nota notaConsultada: this.getNota()) {
            if (notaConsultada.getAluno().equals(nota.getAluno()))
                return false;
        }
        return this.getNota().add(nota);
    }
    
    public Nota retornaNota (Aluno aluno) {
        return this.getNota().get(this.getNota().indexOf(nota));
    }
    
    @Override
    public int compareTo (Atividade atividade) {
        return this.id.compareTo(atividade.id);
    }
    
    @Override
    public String toString () {
        return ("ID: " + this.id + "\nNome: " + this.nome +
                "\nTipo: " + this.tipo + "\nValor: " + this.valor +
                "\nDisciplina: " + this.turma.getDisciplina().getNome() + "\n");
    }
    
    //LEMBRAR DE APAGAR
    public void imprimirListaNotas () {
        for (Nota nota: this.nota)
            System.out.println(nota.toString() + "\n");
    }
}