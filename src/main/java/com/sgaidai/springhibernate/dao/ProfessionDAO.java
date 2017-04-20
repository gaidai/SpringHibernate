
package com.sgaidai.springhibernate.dao;


import com.sgaidai.springhibernate.entity.Profession;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public interface ProfessionDAO {
 
    public Serializable addProfession(Profession p);
 
    public void updateProfession(Profession p);
 
    public void deleteProfession(Profession p);
 
    public List<Profession> findProfession();

    
}