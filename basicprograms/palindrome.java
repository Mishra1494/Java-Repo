import java.util.Scanner;
class palindrome
{
    public static void main(String []args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your num");
     int num = sc.nextInt();
     int temp = num;
     int quat = 0 ;
     int result = 0;
     while(num>0)
     {
        quat = num%10;
        result = (result*10)+quat;
        num = num/10;
      }
      if(temp == result)
      {
       System.out.println("Your number is palindrome. And Your num is: "+temp);
      }else{ System.out.println("Your number is not palindrome. And Your num is: "+temp);}


     }


}