class employee
{
   private int emp_id;//private variable
   public void setEmp_id(int empid)
   {
          //setter method
          emp_id = empid;
   }
   public int getEmp_id()
   {
     return emp_id;
   }
}
class emcapsulation
{
   public static void main(String[] args)
   {
      employee obj = new employee();
      obj.setEmp_id(10);
      int get_emp_id = obj.getEmp_id();
      System.out.println(get_emp_id);
   }
}