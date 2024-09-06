class DeamonThreads extends Thread
{
    public void run()
    {      if(Thread.currentThread().isDaemon())//cheaking the current thread is deamon or not
           {
           System.out.println("the Daemon thread");
           }
           else
           {
           System.out.println("the not Deamon thread");
           }
    } 
    public static void main(String[] args)
    {      

       //  Thread.currentThread().setDeamon(true)we cant do  this here
           System.out.println("hellow from main thread");
           DeamonThreads t = new DeamonThreads();


           t.setDaemon(true);//always creat Deamon thread beforr the thread is start if not them                                                   //runtime exception will occur i.e. IlligleThreadStateExcepion 
          


         t.start();//here now this thread will start
         //we can't change 

       //t.setDeamon(); we cant do this here as the thread is already started so this will through    
                        //runtime exception
    }
}



/*Always remember that Deamon Thread to be work the parent class should do some work in which the Deamon thread iscreated we cant not change a normal method to Deamon thread during runtime*/