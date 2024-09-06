class ThreadCreation extends Thread 
{
   public void run()
   { 
          //here we can write the task of thread 
         System.out.println("Thread task 1");
   }
   public static void main(String[] args)
   {
        ThreadCreation t = new ThreadCreation();
        t.start();//thread can be invoked only one time once died thread can't be rebirth
   }
}