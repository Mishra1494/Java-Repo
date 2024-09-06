class static_keyword4//this will tell you about static blocks
{
   
   static
   {
      System.out.println("hellow from static blocks");
   }
   public static void main(String[] args)
   {
      System.out.println("hellow from main method");

   }
   static
   {
      System.out.println("hellow from second static blocks");
   }
   
}
/* compiler will read all static blocks and will chek that main method is present or not if present then will run all static blocks first then  line by line if main method will not present then the
copiler will through exception*/

// SEE THE USAGE OF STATIC BLOCK IN NOTES  