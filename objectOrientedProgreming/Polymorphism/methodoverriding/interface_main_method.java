//interfaces have all the method are of abstract type so they provide 100% abstraction
//interface provide but we can also create default cocrete methods and static concrete method
//interafces always have public as access modifiea if we don't add it compiler will do 
interface I1
{
   void show();
   default void show1()
   {
        System.out.println("Default interface method");
   } 
}
interface I2
{
    void show2();
}
interface I3 extends I1
{
    void show3();
}
class display implements I2,I3
{
   void show()
   {
       System.out.println("show 1 method print ");
   }
   void shows2()
   {
      System.out.println("show 2 method print ");
   }
   void show3()
   {
       System.out.println("show 3 method print ");
   }
}
class interface_main_method
{
   public static void main(String[] args)
   {
       display obj = new display();
       obj.show();
       obj.show1();//interface method  
   }
}