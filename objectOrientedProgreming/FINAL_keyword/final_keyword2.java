final class test1
{
   void show()
   {
      System.out.println("I am the class method which is can't be inherited");
   }
}
class final_keyword2
{
    public static void main(String[] args)
    {
       test1 obj = new test1();
       obj.show(); 
    }
}
