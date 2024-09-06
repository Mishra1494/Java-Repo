class test3
{
  test3()
  {
     System.out.println("I am parent class constructor");
  } 
}
class super_keyword4 extends test3
{
   super_keyword4()
   {  
      super();//to call constructor of parent class
      System.out.println("I am child class constructor");
   }
   public static void main(String[] args)
   {
      super_keyword4 obj = new super_keyword4(); 
   }
}