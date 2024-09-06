class test
{
    static int l = 10;
    void show()
    {
         
    }
}

class static_keyword
{
   static int k = 10;//for class level variable
   void show()
   {
      // Static int j = 20; we can't decaler it here as it is local variable
      int j = 20;
      
   }
   public static void main(String[] args)
   {
     System.out.println(test.l);//as static variable are class level variables
     
   }
}