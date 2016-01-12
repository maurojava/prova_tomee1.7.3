/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.closedb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author mauro
 */
@Singleton
@Startup
public class CloseDBManager {
   @PersistenceContext(unitName = "book-pu")
    private EntityManager entityManager;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@PreDestroy
public void closeDB(){
    try{
entityManager.createNativeQuery("SHUTDOWN").executeUpdate();
    }
    catch(Exception e){
    e.printStackTrace();
    }
  //  if(entityManager!=null){entityManager.close();
    //}
}

  
}
