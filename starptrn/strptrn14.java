class strptrn14
{
              public static void main(String []args)
              {
                  for(int i = 5; i>0; i--)
                  {    
                       for(int j = 5 ; j>i; j--)
                       {
                                System.out.print(" ");
                       } 
                       for(int j = 0; j<(i*2); j++)
                       {
                             if(j>0 && j < (i*2)-1)
                             {
                                 System.out.print(" ");
                             }else{
                                  System.out.print("*");
                             }
                       }
                                            
                       System.out.println();
                  }
              }
}