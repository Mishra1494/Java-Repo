class thisKeyword3//to pass arguments to the method call
{  
   void show(thisKeyword3 td)
   {
      System.out.println("hello this is method which uses current class method object as argument");
   }
   void display()
   {
     show(this);//use for method call 
   }
   public static void main(String[] args)
   {
      thisKeyword3 td = new thisKeyword3();
      td.display();
   }
}
