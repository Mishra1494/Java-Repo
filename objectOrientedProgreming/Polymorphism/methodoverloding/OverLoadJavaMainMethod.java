class OverLoadJavaMainMethod
{
   public static void main(int num)
   {
        System.out.println(num);
   } 
   public static void main(String[] args)
   {
        OverLoadJavaMainMethod obj = new OverLoadJavaMainMethod();
        obj.main(3);
   }
}
// so yes we cvan overload main method in java 