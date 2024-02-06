package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daos.AgentDAO;

import models.AgentModel;



/**
 * Servlet implementation class AgentLogin
 */

public class AgentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
  
       private AgentDAO agentDao;

        public void init() {
        	agentDao = new AgentDAO();
        }
    	
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.getWriter().append("Served at: ").append(request.getContextPath());
    	}

    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String username = request.getParameter("username");
            String password = request.getParameter("password");
            
        
            AgentModel emp = new AgentModel();
            emp.setUsername(username);
            emp.setPwd(password);
           
            try {
                if (agentDao.validate(emp)) {
                	System.out.println("ok");
                
                    HttpSession session = request.getSession();
                     session.setAttribute("username",username);
                     
                 
                    	 response.sendRedirect("http://localhost:8080/dld/views/AgentDashboard.jsp");
                } else {
                   
                    response.sendRedirect("http://localhost:8080/dld/views/AgentLogin.jsp");
                }
            } catch (Exception e) {
            	 e.printStackTrace();
            }
    	}



    	}




