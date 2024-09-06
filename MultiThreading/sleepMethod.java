class sleepMethod extends Thread
{
     public static void main(String[] args) throws InterruptedException
     {
           for (int i = 1; i<=5; i++)
           {
             try
             {
              Thread.sleep(1000);
              System.out.println (i);
	     }catch(Exception e)
             {
               System.out.println(e);
	     } 
          } 
           
     }//here we have handeling exception using throw keywords
      // we dont have have requirments of start and run method for the main thread as it is started //       by jvmm itself it is a default function OKAY  
}