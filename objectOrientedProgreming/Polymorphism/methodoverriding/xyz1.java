
//return type variation => the return type of child class should be subtype of return type of 
//                          parent or of same type

class MethodOverriding2
{
    long show(long k)
    {
       System.out.println("Prent class method");
       return k;
    }
}
class xyz1 extends MethodOverriding2
{
    long  show(long k)
    {
        System.out.println("child class method");
        return 3;
    }
    public static void main(String[] args)
    {
        MethodOverriding2 obj = new MethodOverriding2();
        obj.show(12);

        xyz1 obj1 = new xyz1();
        obj1.show(12);
    }
}


/*more overiirding method are remaing like overriding and exception handling , overriding and acces modifiers,overriding and synchronized */