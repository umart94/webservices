package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Controller handles which views to be displayed.
		RequestDispatcher requestDispatcherip = request.getRequestDispatcher("WEB-INF/views/input.jsp");
		requestDispatcherip.forward(request,response);
			 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String emailid = request.getParameter("emailid");
		insertRecordIntoDB(firstname,lastname,emailid);
		
		//Controller interacts with model class, and we can pass our model class as a request attribute.
		Customer customer = new Customer(firstname,lastname,emailid);
		customer = selectRecordFromDB(emailid);
		
		
		request.setAttribute("customer",customer);
		//Controller handles which views to be displayed.
		RequestDispatcher requestDispatcherop = request.getRequestDispatcher("WEB-INF/views/output.jsp");
		requestDispatcherop.forward(request,response);
	}
	
	protected void insertRecordIntoDB(String firstname,String lastname,String emailid) {
		Connection connection;
		try{  
			Class.forName("com.mysql.cj.jdbc.MysqlDataSource");  
			connection=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mvc?autoReconnect=true&clientCertificateKeyStoreUrl=file:C:\\certs\\mysqlclientkeystore&clientCertificateKeyStorePassword=password","DBUSERNAME","DBPASSWORD");  
			
			
			//Statement stmt=connection.createStatement();  
			//ResultSet rs=stmt.executeQuery("select 4+6 FROM DUAL"); 
			
			/*
			
			ALTER TABLE customer AUTO_INCREMENT=1001;
			we specified auto increment with mysql attribute, but we also have to first set an initial value
			
			 */
			
			String insertQuery = "insert into customer(firstname,lastname,emailid) values(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setString(1,firstname);
			ps.setString(2,lastname);
			ps.setString(3,emailid);
			ps.executeUpdate();  
			
			
	
			
			connection.close();  
			} catch(Exception e){ 
				
				System.out.println(e);
			}  
		
	}
	
	protected Customer selectRecordFromDB(String emailid) {
		Customer customer = new Customer("","","");
		Connection connection2;
		try{  
			Class.forName("com.mysql.cj.jdbc.MysqlDataSource");  
			connection2=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mvc?autoReconnect=true&clientCertificateKeyStoreUrl=file:C:\\certs\\mysqlclientkeystore&clientCertificateKeyStorePassword=PASSWORD","DBUSERNAME","DBPASSWORD");  
			
			
			//Statement stmt=connection.createStatement();  
			//ResultSet rs=stmt.executeQuery("select 4+6 FROM DUAL"); 
			
			String selectQuery = "SELECT firstname,lastname,emailid from customer where emailid=?";
			PreparedStatement ps = connection2.prepareStatement(selectQuery);
			ps.setString(1,emailid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String emailidfromDB = rs.getString("emailid");
				customer.setFirstname(firstname);
				customer.setLastname(lastname);
				customer.setEmailid(emailidfromDB);
				
			}
			
	
			
			connection2.close();  
			} catch(Exception e){ 
				
				System.out.println(e);
			} 
		return customer;
	}

}
