
// DONE THROUGH INHERITANCE usese DIFFERENT CLASSES

class MethodOverriding1
{
   void show()
   {
      System.out.println("1");
   }
}
class xyz extends MethodOverriding1
{
    void show()
    {
       System.out.println("2");
    }
    public static void main(String[] args)
    {
       MethodOverriding1 obj = new MethodOverriding1();
       obj.show();

       xyz obj1 = new xyz();
       obj1.show();
    }
}