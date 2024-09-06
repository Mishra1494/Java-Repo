class finaly_keyword//we can use finaly block after try block or try & catch block finally block is  
                    //finaly block is always excuted 
{
   public static void main(String[] args)
   {
       try
       {
          int a = 10, b= 0, c;// in try we write risky code
          c = a/b;
       }
       catch(ArithmeticException e)
       {
          System.out.println(e);//handlig code
       }
       finally
       {
         System.out.println("Finally block is excuted");//clean up code`
       }
   }
}