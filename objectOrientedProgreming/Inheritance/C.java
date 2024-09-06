/* program fo multilevel inheritence */



class A
{
 void showA()
 {
   System.out.println("A class method");
 }
}
class B extends A
{
   void showB()
   {
     System.out.println("B class method");
   }
}
class C extends B
{
   public static void main(String[] args)
   {
          C obj_of_C = new C();
          obj_of_C.showC();//object of c can call all the methods of A & B & C
          obj_of_C.showB();
          obj_of_C.showA();

          B obj_of_B = new B();
          obj_of_B.showB();//object of B can call only methods of A & B
          obj_of_B.showA();

          A obj_of_A = new A();
          obj_of_A.showA();//can call only methods of A
   }
   void showC()
   {
        System.out.println("C class method");
   }
}