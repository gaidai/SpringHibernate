package com.sgaidai.springhibernate.dao;


import com.sgaidai.springhibernate.entity.Profession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;



public class ProfessionDAOImpl implements ProfessionDAO {
    
    private SessionFactory sessionFactory;  
    
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
    
    
    @Override
    public Serializable addProfession(Profession p) {
        Session session = this.sessionFactory.openSession();  
         Transaction tx = session.beginTransaction();  
         session.persist(p);  
         tx.commit();  
         session.close();
        return null;
    }

    @Override
    public void updateProfession(Profession p) {
      //  template.saveOrUpdate(p);
    }

    public void deleteProfession(Profession p) {
      //  template.delete(p);
    }

    public Profession getProfession(Long id) {
       return  null;//(Profession) load(Profession.class, id);
    }

    public List<Profession> findProfession() {
        List<Object> List = null;
        List<Profession> r = new ArrayList();
        
        //List = (List<Object>) template.find("FROM Profession ORDER BY professionName");
        for(Object l:List){
            r.add((Profession)l);
        }
        return r;
    }
 
}