class leapyearsecond 
{ 
   public static void main(String [] args)
    {
       int year = 1000 ;
       if( (year%4 == 0 && year%100 != 0) || (year%400 == 0))
       {
        System.out.print(year + " is a leap year ");
       }
       else
       {
        System.out.print(year + " is a leap year ");
       }
   }
}