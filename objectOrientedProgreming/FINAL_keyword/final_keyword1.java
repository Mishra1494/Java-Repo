class test
{
   final void show()
   {
      System.out.println("i am in method which is can't be override due to final keyword");
   }
}
class final_keyword1 extends test
{  
   void display()
   {
      super.show();
   }
   public static void  main(String[] args)
   {
      final_keyword1 obj = new final_keyword1();
      obj.display();
   }
}
 
 