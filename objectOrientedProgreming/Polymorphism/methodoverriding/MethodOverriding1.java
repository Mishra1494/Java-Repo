
// DONE THROUGH INHERITANCE usese DIFFERENT CLASSES

class MethodOverriding1
{
   void show()
   {
      System.out.println("Prent class method");
   }
}
class xyz extends MethodOverriding1
{
    void show()
    {
       System.out.println("child class method");
    }
    public static void main(String[] args)
    {
       MethodOverriding1 obj = new MethodOverriding1();
       obj.show();

       xyz obj1 = new xyz();
       obj1.show();
    }
}