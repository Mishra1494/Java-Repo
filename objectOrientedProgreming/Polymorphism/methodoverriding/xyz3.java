class overriding4// use of super keyword
{
    void show()
    {
       System.out.println("parent class methods ");
 
    }
}
class xyz3 extends overriding4
{
    void show()
    {
          super.show();//this will invoke the parent class method
          System.out.println("child class method");
    }
    public static void main(String[] args)
    {
        xyz3 obj = new xyz3();
        obj.show();
    }
}