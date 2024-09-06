abstract class parent
//abstract class provide (0-100)% abstraction
{
    abstract void show();//abstract method
    void show1()
    {
       System.out.println("parent class non abstract method ");
    }
}
class child extends parent
{
    void show()
    {
       System.out.println("abstract method body is implemented here through inheritance");
    }
    void show1()
    {
       System.out.println("child class non abstract method");
    }
}
class abstraction
{
      public static void main(String[] args)
      {
         child obj1 = new child();
         obj1.show();
         obj1.show1();
      }
}
/* ABSTRACTION IS ACHIVED WITH THE HELP OF INHERITANCE , METHOD OVERRIDING,ABSTRACT KEYWORD AND USING ITERFACES*/