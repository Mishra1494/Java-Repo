class Promotion_study4
{
  void show(int k , float l)
  {
     System.out.println("Integr and  float show method");
  }
  void show(float l , int k)
  {
     System.out.println("float and  Integr show method");
  }
  public static void main(String[] args)
  {
     Promotion_study4 obj =  new Promotion_study4();
     obj.show(10,10.1);//this will run int float method
     obj.show(10.1,10);//this will run float int method
  }
}
// this program is not running can study more about promotions