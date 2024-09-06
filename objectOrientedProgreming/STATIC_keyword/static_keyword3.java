class static_keyword3//this code is about static methods which are belong to class not to object
{
    static void show()
    {
       System.out.println("A static method");
    }
    public static void main(String[] args)
    {
      /* we can call static methods by using or without using static key we don't write their the compiler will add there*/
       static_keyword3.show();
    }
}