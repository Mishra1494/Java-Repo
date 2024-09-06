import java.util.Scanner;
class reverstring
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your string to be reversed:");
       String s =  sc.next();
       String k = " ";
       for(int i = s.length()-1; i>=0; i--)
       {
         k += s.charAt(i);
       }
       System.out.println("Your reversed String is:"+k);
    }
}
     
   