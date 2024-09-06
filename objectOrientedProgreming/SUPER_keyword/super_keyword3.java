class test2
{
   void show()
   {
      System.out.println("hello I am parent class show method");
   }
}
class super_keyword3 extends test2//use to parent class methods
{
   void show()
   {  
      super.show();
      System.out.println("I am parent class show method");
   }
   void m1()
   {
      this.show();//will call show method with in the class
   }
   public static void main(String[] args)
   {
      super_keyword3 obj  = new super_keyword3();
      obj.m1();
   }
}