
package survey;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SQLQuery;

/**
 *
 * @author Angel
 */
public class surveyHelper {
    
    Session session = null;
    
     public surveyHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
     
     public int getUser(){
        
        List<User> userList = null;
        
        String sql = "select * from user order by User_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(User.class);
            
            // executes the query and returns it as a list
            userList = (List<User>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return userList.get(0).getUserId();
    }
     
     
     public int getSurveyId(){
        
        List<Survey> surveyList = null;
        
        String sql = "select * from survey order by Survey_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            // executes the query and returns it as a list
            surveyList = (List<Survey>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return surveyList.get(0).getSurveyId();
    }

     public int insertSurvey(String surveyName, int user){
        int result = 0;
        
        user = getUser();
        
        String sql = "insert into survey(Survey_Name, User_ID)"
                + "values (:surveyName, :userId)";

        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Survey.class);
            
            // binds values to the placeholders in the query
            q.setParameter("surveyName", surveyName);
            q.setParameter("userId", user);
           
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
     }  
}
