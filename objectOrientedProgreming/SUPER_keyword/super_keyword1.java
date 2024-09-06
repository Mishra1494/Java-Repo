class test
{
   void show()
   {
      System.out.println("hello i am parent class method"); 
   }
}

class super_keyword1 extends test //parent class
{
     void show()
     {  
        super.show();// call to parent class method
        System.out.println("hello i am child class method of show");
     }
     public static void main(String[] args)
     { 
        super_keyword1  obj =  new super_keyword1();
        obj.show();
     }
}


/* USE= Immediate reference for parent class in inheritance */