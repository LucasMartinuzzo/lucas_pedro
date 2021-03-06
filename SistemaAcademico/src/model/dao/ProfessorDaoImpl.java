package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.pojo.Professor;

public class ProfessorDaoImpl implements Dao<Professor> {    
    private static ProfessorDaoImpl instancia = null;
    
    public static ProfessorDaoImpl getInstancia(){
        if(ProfessorDaoImpl.instancia == null)
            instancia = new ProfessorDaoImpl();
        return instancia;
    }
    
    @Override
    public void salvar (EntityManager em, Professor professor){
        em.getTransaction().begin();
        try{
            em.persist(professor);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    @Override
    public Professor buscar (EntityManager em, Object cpf){
        Professor professor = new Professor(null, null, null);
        em.getTransaction().begin();
        try{
            professor = em.find(Professor.class, cpf);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return professor;
    }
            
            
    @Override
    public void alterar (EntityManager em, Professor professor){
        em.getTransaction().begin();
        try{
            em.merge(professor);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    @Override
    public List<Professor> obterTodos (EntityManager em){
        Query query = em.createQuery("SELECT e FROM Professor e");
        return (List<Professor>) query.getResultList();
    }
}
