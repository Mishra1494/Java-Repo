class sleepMethod2 extends Thread
{
     public void run()
     {
         for(int i = 0; i<=5; i++)
         {
           	try
           	{
   	     		Thread.currentThread().sleep(1000);
             		System.out.println(i);
                }catch(Exception e)
         	{
           		System.out.println(e);
         	}
        }
     }
     public static void main(String[] args)
     {
         sleepMethod2 th = new sleepMethod2();
         th.start();
     }
}