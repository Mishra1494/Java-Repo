import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class connection_close
{
   public static void main(String[] args)
   {
       Connection con = null;
       PreparedStatement ps = null;
       ResultSet rs = null;
   
       try
       {
          // do risky stuff here
       }
       catch (Exception e)
       {
          // Exception handling stuff
       }
       finally
       {
          try
          {
             rs.close();
          }
          catch(SQLException e)
          {
                 // Exception handling stuff
          }
          try 
          {
              ps.close();
          }
          catch(SQLException e)
          {
              // Exception handling stuff
          }
          try
          {
             con.close();
          }
          catch(SQLException e)
          {
              // Exception handling stuff
          }
       }
   }
}