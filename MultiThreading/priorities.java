class priorities extends Thread
{
     public void run()
     {     
           System.out.println(Thread.currentThread().getPriority());
           System.out.println("hello this is run non Deamon  method");
     }
     public static void main(String[] args)
     {
          System.out.println(Thread.currentThread().getPriority());
          Thread.currentThread().setPriority(3);
          System.out.println(Thread.currentThread().getPriority());
          priorities t = new priorities();
          t.start();
          t.setPriority(10); //here we changed the priority of child thread
          
     }
}

/* prioroties of parent class is always pass to the child thread but there is one case is if change 
   the prioritiy child class it will change*/
