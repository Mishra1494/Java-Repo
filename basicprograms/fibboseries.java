import java.util.Scanner;
class fibboseries
{
     public static void main(String []args)
     {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter the limit of fibboseries");
      int num = sc.nextInt();
      int a = 0, b = 1 , c=0;
      System.out.println("Your fibbo series upto "+num+" is :");
      System.out.println(a);
      System.out.println(b);
      for (int i = 0; i < num; i++)
      {
       c = a+b;
       System.out.println(c);
       a = b;
       b = c;
      }
     }
}
