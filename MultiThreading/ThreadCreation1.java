class ThreadCreation1 implements Runnable
{
    public void run()
    {
       System.out.println("Thread task 2");
    }
    public static void main(String[] args)
    {
       ThreadCreation1 t = new ThreadCreation1();
       Thread th = new Thread(t);
       th.start();
    }
}