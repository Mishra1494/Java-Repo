class Test
{
    void show()
    {
      System.out.println("1");
    }
    int show(int N)//argument can vary in order, number and type
    {
      System.out.println("2");
      return N;
    }
    public static void main(String[] args)
    {
       Test t = new Test();
       t.show();//this will print 1
       t.show(7);//this will print 2
    }
  
}
//it is not possible ton overload methods solely depending on return type  variation the argument 
// should varry for thiis purpose   