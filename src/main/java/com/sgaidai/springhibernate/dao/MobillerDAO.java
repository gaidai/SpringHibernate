package com.sgaidai.springhibernate.dao;




import com.sgaidai.springhibernate.entity.Friend;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

 @Transactional(propagation=Propagation.REQUIRED ) 
public class MobillerDAO {
       
    private HibernateTemplate template;

    
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }  
    @Transactional(propagation=Propagation.SUPPORTS, readOnly = false)
    public void addFriend(Friend f) {
           template.saveOrUpdate(f);
    }
  
    
    public String getdate () throws ParseException{
        
        Date date1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy. MM. dd  hh:mm");
         
       String time = format1.format(date1);
       // parsedDate = new SimpleDateFormat("yyyy.MM.dd  hh:mm").parse("16.04.2004");
        
        return time;
     
    }
}
   
