class Promotion_study1
{
    void show(int a)
    {
        System.out.println(a + " int show method");
    }
    void show(String s )
    {
       System.out.println(s + " string show method");
    }
    public static void main(String[] args)
    {
        Promotion_study1  obj = new Promotion_study1();
        obj.show('a');//we pass char as input this will automatically promoted to the Intger
    }
}

// one type can be promoted to another if no data type is found in method overloading