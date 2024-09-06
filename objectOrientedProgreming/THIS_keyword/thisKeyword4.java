class test
{
   test(thisKeyword4 td)
   {
      System.out.println("this is constructor whose argument is thisKeyword4 class as obj as argument");
   }
}
class thisKeyword4
{   
    void display()
    {
       test t = new test(this);//constructor call 
    }
    public static void main(String[] args)
    {
       thisKeyword4 td = new thisKeyword4();
       td.display();
    }
}