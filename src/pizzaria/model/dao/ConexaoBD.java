package pizzaria.model.dao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.hibernate.cfg.AvailableSettings.DRIVER;
import static org.osgi.service.metatype.AttributeDefinition.PASSWORD;

/**
 *
 * @author Douglas
 */
public class ConexaoBD {
    
    
    
    private static ConexaoBD bd;
    
    private EntityManagerFactory factory;
    
    
    private ConexaoBD(){
        try{        
            
            this.factory = Persistence.createEntityManagerFactory("Pizzaria");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static synchronized ConexaoBD getInstance(){
        if(bd == null)
            bd = new ConexaoBD();
        
        return bd;
    }
    
    
    public EntityManager getEntityManager(){
        return this.factory.createEntityManager();
    }
    
}
