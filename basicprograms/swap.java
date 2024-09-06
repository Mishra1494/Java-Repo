class swap
{
   public static void main(String []args)
   {
       int a = 10, b = 20 ;
       System.out.println("nums before swapping"+" a = "+a+" b = "+b);  
       int temp = a;
       a = b;
       b = temp;
       System.out.println("nums after swapping " +" a = " +a+" b = "+b);
  }
}