import java.util.*;

class YoungAgeException extends RunTimeException
{
      YoungAgeException()
      {
            Super("you cant't vote");
      }
      YoungAgeException(string Msg)
      {
         Super(Msg);
      }
}
class throwKeyword 
{
     public static void main(String[] args)
     {    
          Scanner sc = new Scanner(System.in);
          int age = sc.nextInt();
          try
          {
              if(age<18)
              {
                  throw new YoungAgeException();
              }
              else
              {
                  System.out.println("Your eligible");
              }
          }
          catch(Exception e)
          {
                    
          }
     }
}