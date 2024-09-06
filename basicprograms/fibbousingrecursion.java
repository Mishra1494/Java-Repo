import java.util.Scanner;
class fibbousingrecursion
{  static int a = 0 , b = 1 ,c;
   public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the limit of fibboseries");

     int range = sc.nextInt();
     System.out.println("Your fibbo series upto "+range+" is :");
     System.out.print(a);
     System.out.print(b);

     fibbousingrecursion ob = new fibbousingrecursion();
     ob.fibbo(range);
     
   }
   void fibbo(int range)
   {  
      if(range >= 1)
      {
      c = a+b;
      System.out.print(c);
      a = b;
      b = c;
      fibbo(range-1);
      }
   }
}


       