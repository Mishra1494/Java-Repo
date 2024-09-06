abstract class overriding3
{
   abstract void show();//abstract merthods which cant be called
   // all abstract methods should be inherited their made for inheritance
   
   void show2()
   {
      System.out.println("2");
   }
    
}
class xyz2  extends overriding3
{
    void show()
    {
        System.out.println("child class body of abstract method ");
    }
    public static void main(String[] args)
    {
       xyz2 obj = new xyz2();
       obj.show();


       // overriding3 obj1 = new overriding3();
       //  obj1.show(); abstract class cant be intantited
       overriding3 obj1 = new xyz2();
       obj1.show2();
    } 
}