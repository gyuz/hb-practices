package simple.core.dao;

import org.hibernate.*;
import org.hibernate.cfg.*;

public abstract class CrudImpl<T> implements CrudInterface<T>{
      private Session session;
      private Transaction tx;
      private static SessionFactory sessionFactory;
      
      protected static void newSessionFactory(){
            sessionFactory = new Configuration().configure().buildSessionFactory();      
      }      
      
      protected void setSessionTransaction(){
            session = this.sessionFactory.openSession();      
      }

      public void persists(T entity){
            setSessionTransaction();
            try{
                  tx = this.session.beginTransaction();
                  session.saveOrUpdate(entity);
                  tx.commit();
            } catch (HibernateException he) {
                  if (tx!=null) tx.rollback();
                  he.printStackTrace();
            } finally {
                  session.close();
            }
      }   
      
      protected static void closeSessionFactory(){    
            sessionFactory.close();      
      }        
}
