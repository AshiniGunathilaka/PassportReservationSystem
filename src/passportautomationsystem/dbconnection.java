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
import java.sql.PreparedStatement;
/**
 *
 * @author ashin
 */
public class dbconnection {
    Connection conn;
    
    public Connection connect() {
    
    try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PassportReservationSystem","root","121212");
			return conn;
	
	}
	catch(SQLException e) {
		System.out.println("connection fail");
                return conn;
	}
    }

    //user newUserAccount jframe form
    // insert data to user newUserAccount jframe form
    public void signupp(int ui ,String un,String pw, String el ){
            try{
                
                
                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO newUserAcounts (userId,userName,passwords,userEmail) VALUES ('"+ui+"','"+un+"','"+pw+"','"+el+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
}
               catch(SQLException e){
                  System.out.println("Insert Failed!!");

            }
    }
    
    
    //passport Application form
    //insert data to passport Application form
    public void application(int a1 ,String a2, String a3 ,String a4, String a5, String a6, String a7){
            try{
                
                
                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO passportApplication (userId,userName,surname, Email, confirmEmail, phoneNumber, Nationality) VALUES "
                            + "('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
                }
               catch(SQLException e){
                  System.out.println("Insert Failed!!");
    
            }       
    }
    
    //basic information jframe form
    //insert data to basic information jframe form
    public void basicInfo(int b1 ,String b2, String b3 ,int b4, String b5){
            try{

                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO basicInformationForm (userId,gender,address,dateOfBirth,place) VALUES "
                            + "('"+b1+"','"+b2+"','"+b3+"','"+b4+"','"+b5+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
            }
               catch(SQLException e){
                  System.out.println("Insert Failed!!");
    
            }
    }
    
    
    //bank information insert data
    
    public void bankinfo(int jTextField4 ,String jTextField1,String jTextField2, String jTextField3 ){
            try{
                
                
                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO paymentDetails (userId,accountNo,otpNo,amount) VALUES"
                            + " ('"+jTextField4+"','"+jTextField2+"','"+jTextField2+"','"+jTextField3+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
}
               catch(SQLException e){
                  System.out.println("Insert Failed!!");

            }
            
    
    }
    
    //admin new account jframe form
    // insert data
    public void adminInfo(int c1 ,String c2, String c3,String c4 ){
            try{
                
                
                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO adminDetails(adminId,adminName,adminPassword,adminemail) VALUES ('"+c1+"','"+c2+"','"+c3+"','"+c4+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
            }
               catch(SQLException e){
                  System.out.println("Insert Failed!!");

            }
    
    }
    // search admin from adminDetails
     public void adminsearch(String s1){
         connect();
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM adminDetails WHERE adminemail=('"+s1+"');";
            ResultSet rs=stmt.executeQuery(query);
            if (rs.next()){
                System.out.println("email  found!!");
                    do {
                        System.out.println("adminemail :"+rs.getString("adminemail"));
                        
                    }while(rs.next());
                 
                  }  
            else{
                System.out.println("email  Founds!!");
                    }
            
        }
    
                catch(SQLException e){
                        System.out.println("SQLExseption:"+e.getMessage());
                        System.out.println("serch not failiur!!");

                }      
     }

    // create user new account
    
      public void userNewAccount(int b1 ,String b2, String b3 ,int b4, String b5, String b6){
            try{                               
                Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO userNewAccount (userId,gender,address,dateOfBirth,place) VALUES "
                            + "('"+b1+"','"+b2+"','"+b3+"','"+b4+"','"+b5+"','"+b6+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
                }
               catch(SQLException e){
                  System.out.println("Insert Failed!!");
    
                }
    }
      //insert data to placeAppointmentData
      
      public void placeappointment(int p0 ,String p1 ,String p2  ){
          connect();
          try{
              Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO placesAppointment (userId,appData,appTime) VALUES ('"+p0+"','"+p1+"','"+p2+"');"; 
                   stmt.executeUpdate(Query);
                   System.out.println("Inserted Successfully");
                }
               catch(SQLException e){
                  System.out.println("Insert Failed!!");   
          }
      }
      // search data from passportApplication
    public void searchData(int s1){
        try{
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM passportApplication WHERE userId="+s1;
            ResultSet rs=stmt.executeQuery(query);
            if (rs.next()){
                System.out.println("Id  found!!");
                    do {
                        System.out.println("userId :"+rs.getInt("userId"));
                        System.out.println("userName :"+rs.getString("userName"));
                         System.out.println("surname :"+rs.getString("surname"));
                          System.out.println("Email :"+rs.getString("Email"));
                          System.out.println("confirmEmail :"+rs.getString("confirmEmail"));
                          System.out.println("phoneNumber :"+rs.getString("phoneNumber"));
                          System.out.println("Nationality :"+rs.getString("Nationality"));
                    }while(rs.next());
                 
                  }  
            else{
                System.out.println("Id Not Found!!");
                    }
            
        }
    
                catch(SQLException e){
                        System.out.println("serch failiur!!");

                }      }
    
           // update data in passportApplication
        
    public void dataUpdate( int a1,String a2, String a3 ,String a4, String a5, String a6, String a7){
                try{
                Statement stmt = conn.createStatement();
                String query = "UPDATE passportApplication SET userName='"+a2+"' WHERE userId="+a1;
                stmt.execute(query);
                    System.out.println("Updated Sucessfully");
            }
                catch(SQLException e){
                    System.out.println("Update Failed!!");
                }
    }
    
    // delete data in passportApplication
   public void deleteData(int jTextField8,String jTextField2, String jTextField3 ,String jTextField4, String jTextField5, String jTextField6, String jTextField7){
                try{
                Statement stmt = conn.createStatement();
                String query = "DELETE FROM passportApplication WHERE userId=('"+jTextField8+"');"; 

                stmt.execute (query);
                System.out.println("Deleted Successfully");
            }
                catch(SQLException e){
                    System.out.println("Delete Failed!!");
                }
   }
}

















   /*public class DatabaseManager {
    // Other methods for initializing database connection, executing queries, etc.

    public boolean updateDatabase(String id, String name, String surname, String email, String conEmail, String phoneNo, String nationality) {
       
        boolean success = false;
        try {
            // Example SQL update statement
            String sql = "UPDATE your_table SET name=?, surname=?, email=?, con_email=?, phone_no=?, nationality=? WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, email);
            statement.setString(4, conEmail);
            statement.setString(5, phoneNo);
            statement.setString(6, nationality);
            statement.setString(7, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }
}
   

}

// Get the selected row indices
int[] selectedRows = tb1_user.getSelectedRows();

// Iterate over the selected row indices in reverse order to avoid issues with shifting indices
for (int i = selectedRows.length - 1; i >= 0; i--) {
    // Remove the row from the table model
    model.removeRow(selectedRows[i]);
    
    // Remove the corresponding data from the database
    int id = (int) model.getValueAt(selectedRows[i], 0); // Assuming the ID is in the first column
    //deleteFrompassportApplication(id); // Call a method to delete the data from the database
}*/
        
