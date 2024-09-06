class test1
{
     int i = 10;
}
class super_keyword2 extends test1
{    
     int i = 20;
     void show(int i)
     {
       System.out.println("args value of i is:"+i);//this will args value of i
       System.out.println(this.i+"this is instatce variable value of i");//this will print 20
       System.out.println(super.i+"this is parent class variable value of i");//this will print 10 
     }
     public static void main(String[] args)
     {
       super_keyword2 obj = new super_keyword2();
       obj.show(30); 
     }
}
