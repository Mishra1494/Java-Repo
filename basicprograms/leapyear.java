class leapyear
{
        public static void main(String []args)
        {
              int year = 2016 ;
              if (year%4 == 0)
              {
                 if(year%100 == 0)
                           {
                           if(year%400==0)
                              {
                                System.out.print(year + " is a leap year");
                              }
                              else
                              {
                                System.out.print(year + " is a not leap year");
                               }
                           }else
                           {
                            System.out.print(year+" is leap year");
                           } 

              }else
 
              {
               System.out.print(year + " is a not leap year");
              }

       }
} 