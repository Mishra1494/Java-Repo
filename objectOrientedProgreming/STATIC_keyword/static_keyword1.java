/* it use for the purpose of the memory manegment you can see it from below code as static keyword store data in method area so it's so object are not require to call them. also the object take memory in the heap area and the the static variables initialized only one time*/

class employee
{
   int emp_id;
   String emp_name;
   static String company_name = "GOOGLE";
   employee(int emp_id,String emp_name)
   {
      this.emp_id = emp_id;
      this.emp_name = emp_name;
   }
   void display_data()
   {

      System.out.println("name :"+this.emp_name+", id:"+this.emp_id+", company name:"+company_name);
   }
}
class static_keyword1
{
   public static void main(String[] args)
   {
      employee e1 = new employee(1,"Raunak Mishra");
      e1.display_data();
      employee e2 = new employee(2,"Roshan Mishra");
      e2.display_data();
      employee e3 = new employee(3,"Rohit Khandekar");
      e3.display_data();
      
   }
}
/* here after the every  creation of the object the non-static variables are initializing but static variable is remain same and it can be updated but it will not initialize again and again and it will stire in the method area THE STATIC VARIABLE GETS MEMORY ONLY ONCE IN THE CLASS AREA AT THE TIME OF CLASS LOADING */