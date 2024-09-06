import java.util.Scanner;
class checkprime
{
    public static void main(String []args)
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the num for check");
      int num = sc.nextInt();
      for ( int j = 0; j < num; j++)
      {
      if(j == 2)
         {
            System.out.println(2 +" is prime number");
         }
      else
         {
          for ( int i = 2; i<num; i++)
            { 
              if (j % i == 0)
              {  
              
              break;
              }
            }
         System.out.println(num + " is prime");
         }
     }
   }
}  //wrong code it is check its algo