package com.sgaidai.springhibernate;




import com.sgaidai.springhibernate.dao.MobillerDAO;
import com.sgaidai.springhibernate.dao.ProfessionDAO;
import com.sgaidai.springhibernate.dao.ProfessionDAOImpl;
import com.sgaidai.springhibernate.entity.Friend;
import com.sgaidai.springhibernate.entity.Profession;
import java.text.ParseException;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
 
    public static void main(String[] args) throws ParseException {
 
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext(new String[]{"src/main/java/com/sgaidai/springhibernate/SpringFirstDB.xml"});
     //"src/main/java/SpringFirstDB.xml"
     //   ProfessionFacade pf = (ProfessionFacade)context.getBean("professionFacade");
     //   ProfessionView pv = new ProfessionView();
    //    pv.setProfessionName("Java Developer");
    //    Long id = (Long) pf.addProfession(pv);
    //    pv.setProfessionId(id);
     //   pf.updateProfession(pv);
     //   pf.deleteProfession(pv);
    //    pf.findProfession();
    
        MobillerDAO  md= (MobillerDAO)context.getBean("mobillerDAO");
        Friend f = new Friend();
        
        f.setDate(md.getdate());
        f.setFname("spring");
        f.setMobile("0002");
        f.setName("spring");
        
        md.addFriend(f);
        
    }

}