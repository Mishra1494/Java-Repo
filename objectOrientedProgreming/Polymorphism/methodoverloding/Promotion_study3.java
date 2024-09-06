//let us see what happen if we use same level class as argument
class Promotion_study3
{
    void show(String s)
    {
       System.out.println(s+ " String wala method will run here");
    }
    void show(StringBuffer s)
    {
       System.out.println(s + " StringBuffer wala method is running here ");
    }
    public static void main(String[] args)
    {
           Promotion_study2 obj   = new Promotion_study2();
           obj.show("abc"); // string wala method will run here
           obj.show(new StringBuffer("abc"));//stringbuffer wala method will run here
           obj.show(null);// this will run string method
    }

}