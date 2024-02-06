package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import daos.AgentDAO;

import models.AgentModel;

/**
 * Servlet implementation class AgentReg
 */
@WebServlet("/AgentReg")
public class AgentReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentReg() {
        super();
        // TODO Auto-generated constructor stub
    }
    private AgentDAO agentDAO;
    public void init() {
    	agentDAO = new AgentDAO();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in servlet");
		System.out.println(request.getParameter("name"));
		
    	int id=0;
    	String name = request.getParameter("name");
    	String mailid = request.getParameter("mailid");
    	String un =request.getParameter("username");
   

    	

    	String ip = request.getParameter("ipaddress");
    	
    	String password = request.getParameter("password");
	  

	    long contact =Long.parseLong(request.getParameter("contact"));
	    
    	
	    AgentModel bm=new AgentModel();
    bm.setName(name);
  
    bm.setContact(contact);
   
  bm.setIpaddress(ip);
    
    bm.setMailid(mailid);
    bm.setPwd(password);
    bm.setUsername(un);
   
    HttpSession session=request.getSession();
    session.setAttribute("username",un);
    session.setAttribute("password",password);
    	try {
        	id = agentDAO.addAgent(bm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    	if(id>0) {
    		response.sendRedirect("http://localhost:8080/dld/views/AgentDashboard.jsp");
    	}
    	else {
    		response.sendRedirect("http://localhost:8080/dld/views/AgentReg.jsp");

    	}
    	}
    }