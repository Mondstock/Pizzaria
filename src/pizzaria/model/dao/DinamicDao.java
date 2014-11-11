package pizzaria.model.dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import pizzaria.model.vo.Cliente;

/**
 *
 * @author Douglas
 * @param <T>
 */
public class DinamicDao<T>{

    public T inserir(T obj) throws SQLException {
        EntityManager manager = ConexaoBD.getInstance().getEntityManager();

        manager.getTransaction().begin();       
        manager.persist(obj);
        
        manager.getTransaction().commit();

        return obj;

    }
    
    public void alterar(T obj) throws SQLException {
        EntityManager manager = ConexaoBD.getInstance().getEntityManager();
        
        manager.getTransaction().begin();
        manager.merge(obj);
        manager.flush();
        manager.getTransaction().commit();
    }
    
    public void excluir(T obj, int codigo) throws SQLException {
        EntityManager manager = ConexaoBD.getInstance().getEntityManager();
        
        manager.getTransaction().begin();
        manager.remove(manager.getReference(Class.class,codigo));
        manager.getTransaction().commit();
    }
    
    public T buscar(Class<T> T, int codigo) throws SQLException {
        EntityManager manager = ConexaoBD.getInstance().getEntityManager();
        
        return manager.find(T, codigo);
    }
    public List<Class> buscar(Class classe) throws SQLException {
        EntityManager manager = ConexaoBD.getInstance().getEntityManager();
        
        //Query query = manager.createQuery("select c from " + "Cliente as c");
        //query.setParameter("nome", nome);        
        //return query.getResultList();
        
        return manager.createQuery(manager.getCriteriaBuilder().createQuery(classe)).getResultList();
    }
}
