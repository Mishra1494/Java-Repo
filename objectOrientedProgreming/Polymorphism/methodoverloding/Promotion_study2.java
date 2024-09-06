class Promotion_study2
{
 
   void show(Object c)
   {
      System.out.println(c + " object wala method");
   }
   void show(String c)
   {
        System.out.println(c + " String wala method");
   }
   public static void main(String[] args)
   {
      Promotion_study2 obj = new Promotion_study2();
      obj.show("abc");
   }
  
}
// as object is parent class of all classes in java if we pass the string the sting wala show method
// will excute here as the string is the data type present as argument in one of the classes so 
// compiler wwill not go for unneccesary promotion