/* this program is about heirarical inheritance */


class HeiraricalInheritancs
{
     public static void main(String[] args)
     {
         Heirachy1 obj_of_1 = new Heirachy1();
         obj_of_1.show1();// can  call method of Heirachy1 only

         Heirachy1of1 obj_of_1_of_1 = new Heirachy1of1();
         obj_of_1_of_1.show1();//can call method of Heirachy1of1 & Heirachy1 both
         obj_of_1_of_1.show1of1();

         Heirachy2of1 obj_of_2_of_1 = new Heirachy2of1();
         obj_of_2_of_1.show1();//can call method of Heirachy2of1 & Heirachy1 both
         obj_of_2_of_1.show2of1();
     } 
}
class Heirachy1
{
    void show1()
    {
        System.out.println("I am Show1 ");
    }
}
class Heirachy1of1 extends Heirachy1
{
   void show1of1()
   {
       System.out.println("I am Show1of1");  
   }    
}
class Heirachy2of1 extends Heirachy1
{
   void show2of1()
   {
       System.out.println("I am Show2of1");  
   }

}