class ArgumentedConstructor
{
      int num;
      String name;
      public ArgumentedConstructor(int k , String n)
      {
          //here we have to pass two argument to our constructors integer k and String s
         this.name = n;
        this.num = k;   
      }
      public static void main(String[] args)
      {
           ArgumentedConstructor SampleObj = new ArgumentedConstructor(12,"Ronda");
      }
}