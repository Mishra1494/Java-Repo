class ThreadCreation2 extends  Thread
{
     public void run()
     {
        System.out.println("thread class");
     }
     public static void main(String[] args)
     {
        ThreadCreation2 t = new ThreadCreation2();
        t.start();
        System.out.println(Thread.currentThread().getName());//geting name of main thread
        System.out.println(t.getName());//geting name of this method
        t.setName("Ronda");//Setting name of the thread 0
        Thread.currentThread().setName("Roshya");
        System.out.println("Thraed main has its name to "+Thread.currentThread().getName());
        System.out.println("Thraed 0 name is now "+t.getName());
     }
}
// one more basic mathod is isAlive() and here the currentThread() is static method we can also run // this you should practic more about exception handling and multuithreading okay 