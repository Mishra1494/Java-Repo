class thisKeyword2

//ues to invoke current class constructors

{
    thisKeyword2()
    {  
       
       System.out.println("non args constructor");
    }
    thisKeyword2(int n ) 
    {  
       this();//local constructor call this this() always use for the constructor call
       System.out.println("argument wala constructor");  
    } 
    public static void main(String[] args)
    {
       new thisKeyword2(10);//parametrized constructor call
    }
}