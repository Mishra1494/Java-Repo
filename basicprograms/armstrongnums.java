import java.util.Scanner;
class armstrongnums
{
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int num1 = num;
    int digitlen = 0;
    int digit = 0;
    int result = 0;
    
    while(num > 0)
       {
           num = num/10;
           digitlen +=1;
       }
    while (temp >0)
       { 
         digit = temp%10;
         for ( int i = 0; i<digitlen; i++)
         {
           digit=digit*digit;
          }
         result = digit+result;
         temp = temp/10;
         
       }
   if (result == num1)
      {
      System.out.print("number is Armstrong");
      }
      else
      {
      System.out.print("number is not Armstrong");
      }

    }
}
