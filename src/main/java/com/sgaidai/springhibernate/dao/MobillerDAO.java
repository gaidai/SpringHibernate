package com.sgaidai.springhibernate.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import com.sgaidai.springhibernate.entity.Friend;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
public class MobillerDAO {
    private SessionFactory sessionFactory;  
    
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
    
    public void addFriend(Friend f) {
        Session session = this.sessionFactory.openSession();  
         Transaction tx = session.beginTransaction();  
         session.persist(f);  
         tx.commit();  
         session.close();
          
        }
        
        
        
        
    
    public String getdate () throws ParseException{
        
        Date date1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy. MM. dd  hh:mm");
         
       String time = format1.format(date1);
       // parsedDate = new SimpleDateFormat("yyyy.MM.dd  hh:mm").parse("16.04.2004");
        
        return time;
     
    }
}
   
