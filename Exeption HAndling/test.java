import java.io.FileInputStream;
class test
{
  public static void main(String[] args)
  {   try
      {
      FileInputStream fis = new FileInputStream("d:/abc.txt");//checked exception
      }catch(Exception e )
      {
         System.out.println(e);
      }
      try
      {
      int a = 100,b = 0,c;
      c = a/b; //this will through unchecked exception
      }catch(Exception e)
      {
          e.printStackTrace();//give info of exception deeply
          System.out.println("_________________________________________________");
          System.out.println(e.toString());//dont"t print stack trace
          System.out.println("_________________________________________________");
          System.out.println(e.getMessage());//print only description
          System.out.println("_________________________________________________");
          System.out.println(e);
          System.out.println("_________________________________________________");
      }
  }
}
