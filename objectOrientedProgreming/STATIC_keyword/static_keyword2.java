class count_demo1
{
   static int k ;// static varibles initializ olny one time at time of class loading
   count_demo1()
   {
      k = k+1;
     System.out.println(k);
   }
}

class count_demo2
{
   int k ;
   count_demo2()
   {
      k = k+1;
     System.out.println(k);
   }
}
 
class static_keyword2
{
   public static void main(String[] args)
   {
      count_demo1 e1 = new count_demo1();
      count_demo1 e2 = new count_demo1();
      count_demo1 e3 = new count_demo1();


      count_demo2 l1 = new count_demo2();
      count_demo2 l2 = new count_demo2();
      count_demo2 l3 = new count_demo2();
   }
}