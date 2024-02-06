package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.AgentModel;
public class AgentDAO {

	
	
	
	
	DBConnection db=new DBConnection();
    Connection connection= db.dbConnect();
	public int addAgent(AgentModel bm) throws ClassNotFoundException {
   	
	    
   
   	
       String INSERT_USERS_SQL = "INSERT INTO agents" +
           "  (name,mailid,contact,ipaddress,password) VALUES " +
           " (?,?,?,?,?);";

       int result = 0;
       try {

           // Step 2:Create a statement using connection object
               PreparedStatement preparedStatement =  connection.prepareStatement(INSERT_USERS_SQL);
               preparedStatement.setString(1,bm.getName());
               preparedStatement.setString(2,bm.getMailid());
              
               preparedStatement.setLong(3,bm.getContact());
               preparedStatement.setString(4,bm.getIpaddress());
               preparedStatement.setString(5,bm.getPwd());

               
         	
              

           // Step 3: Execute the query or update query
               result = preparedStatement.executeUpdate();
               System.out.println(preparedStatement);

           } catch (SQLException e) {
               // process sql exception
               printSQLException(e);
           }
           return result;
       }
	
	//login
	public boolean validate(AgentModel bm) {
		 boolean status = false;

	       try {
	        		 // Step 2:Create a statement using connection object
	                PreparedStatement preparedStatement = connection
	                .prepareStatement("select * from agents where username = ? and password = ?");
	                preparedStatement.setString(1, bm.getUsername());
	                preparedStatement.setString(2, bm.getPwd());

	                System.out.println(preparedStatement);
	                ResultSet rs = preparedStatement.executeQuery();
	               
	                status = rs.next();

	            } catch (SQLException e) {
	               
	                printSQLException(e);
	            }
	            return status;
}
//show all Agents
	
	 public ArrayList<AgentModel> showAllAgents() throws ClassNotFoundException{
     	 
     	 ArrayList<AgentModel> agents=new ArrayList<>();
          try {
                  PreparedStatement preparedStatement = connection
                  .prepareStatement("select * from agents");

                  System.out.println(preparedStatement);
                  ResultSet rs = preparedStatement.executeQuery();
                 while(rs.next()) {
               	  AgentModel ags=new AgentModel();
               	ags.setId(rs.getInt(1));
               	ags.setName(rs.getString(2));
              	 ags.setMailid(rs.getString(3));
              	ags.setContact(rs.getLong(4));
              	ags.setIpaddress(rs.getString(5));
              	 
              	agents.add(ags);
                 	System.out.println(rs.getString(1));
                 }
              } catch (SQLException e) {
                 
                  printSQLException(e);
              }
          System.out.println(agents);
              return agents;
          
     }
		public int forgotpwd(AgentModel employee) throws ClassNotFoundException{ {
			String UPDATE_USERS_SQL = "UPDATE agents set password=? where username=?;";

		     int result = 0;

		    

		     //Step 1: Established the connection with database
		   try (

		     
		         PreparedStatement preparedStatement =  connection.prepareStatement(UPDATE_USERS_SQL)) {
		 	  preparedStatement.setString(1,employee.getPwd());
		         
		        
		        
		         preparedStatement.setString(2,employee.getUsername());

		     // Step 3: Execute the query or update query
		         result = preparedStatement.executeUpdate();
		         System.out.println(preparedStatement);
		     } catch (SQLException e) {
		         // process sql exception
		         printSQLException(e);
		     }
		     return result;
		 } 
		}
		 
		//Show agent on mailid
		
	    public AgentModel showAgentById(String mailid) throws ClassNotFoundException{
	    
	    	AgentModel em=new AgentModel();
	         try {
	        	 
	                 PreparedStatement preparedStatement = connection
	                 .prepareStatement("select * from agents where username =?");
	                 preparedStatement.setString(1, mailid);
	                 System.out.println(preparedStatement);
	                 ResultSet rs = preparedStatement.executeQuery();
	                while(rs.next()) {
	                	em.setName(rs.getString(2));
	               System.out.println(rs.getString(2));
	               em.setContact(rs.getLong(3));
	               System.out.println(rs.getString(3));
	               em.setIpaddress(rs.getString(4));
	               em.setPwd(rs.getString(5));
	              
	                	System.out.println(rs.getString(1));
	                }
	             } catch (SQLException e) {
	                
	                 printSQLException(e);
	             }
	       
	             return em;
	         
	    }
	    
	    
	    
	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }

		}
}
