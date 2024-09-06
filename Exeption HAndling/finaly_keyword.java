class finaly_keyword//we can use finaly block after try block or try & catch block finally block is  
                    //finaly block is always excuted 
{
   public static void main(String[] args)
   {
       try
       {
          int a = 10, b= 0, c;
       }
       catch(Execption e)
       {
          System.out.println(e);
       }
       finally
       {
         System.out.println("Finally block is excuted");
       }
   }
}