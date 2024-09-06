import java.util.Scanner;
class reversnum
{
    public static void main(String []args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your num");
     int num = sc.nextInt();
     int quat = 0 ;
     int result = 0;
     while(num>0)
     {
        quat = num%10;
        result = (result*10)+quat;
        num = num/10;
      }
      System.out.println("Your reverse num is:"+result);


     }


}