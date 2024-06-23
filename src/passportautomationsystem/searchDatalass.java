/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passportautomationsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


/**
 *
 * @author ashin
 */
public class searchDatalass {
    public static void searchdata(String userId){
			
			 
			// Database connection details
            String url = "jdbc:mysql://localhost:3306/PassportReservationSystem";
            String username = "root";
            String password = "121212#";
            
            // SQL query to check username and password
            
            String sql="SELECT userName,surName,Email,ConfirmEmail,phoneNumber,nationality FROM passportApplication WHERE userId = ?";
            try(Connection conn = DriverManager.getConnection(url, username, password))
            		{
           
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, userId);
			
			
			
			ResultSet rs = stmt.executeQuery();
			// Process the results
			
			while (rs.next()) {
			 // Retrieve data from each row
			 
			 String surname =rs.getString("userName");
			 String firstname = rs.getString("surName");
			 String middlename =rs.getString("Email");
			 String Address = rs.getString("ConfirmEmail");
			 String mobile =rs.getString("phoneNumber");
			 String email = rs.getString("nationality");
			 
			// Print or process the retrieved data
			 System.out.println("Data search suceesfully");


			JOptionPane.showMessageDialog(null, "Data search successful:\n"+"surname - " +surname +"\nfirstname - "+firstname+"\nmiddlename - "+middlename+"\nAddress - "+Address+"\nmobile - "+mobile+"\nemail - "+email  );
			
			}}
    		catch(SQLException ex) {
  			 
  			 ex.printStackTrace();
  			
    		}}
	
            		
            		 
        
        

}
        

    
