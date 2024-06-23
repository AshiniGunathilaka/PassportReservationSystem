/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passportautomationsystem;
        import java.sql.*;

/**
 *
 * @author ashin
 */
public class PassportReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		try{
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDb","root","121212");
			System.out.println("sucess");
	
	}
	catch(SQLException e) {
		System.out.println("connection fail");
                
	}
	}
  
   
    

    }
    
