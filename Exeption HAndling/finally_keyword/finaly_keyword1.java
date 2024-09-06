import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class finaly_keyword1
{
   public static void main(String[] args) throws IOException 
   {
      FileInputStream fis = null;
      try
      {
          fis = new FileInputStream("d:/abc.txt");//risky code we write here
      }
      catch( FileNotFoundException e )
      {
          System.out.println("file not found");//handling code we write here
      } 
      finally
      {
           // clean up code here
           if(fis!=null)
           {
               fis.close();
           }
           System.out.println("file closed");
      }
   }  
}