class strptrn13
{
          public static void main(String []args)
          {
            for(int i = 0; i<5; i++)
            {
                 for ( int j = 5; j>i; j--)
                 {
                 System.out.print(" ");
                 }
                 for ( int j = 0; j<(i*2); j++)
                 { 
                      if(j==0 || (i*2)-2 == j)
                      {
                          System.out.print("*");
                      }else{
                          System.out.print(" ");
                      }
                 }                  
                 System.out.println();

            }            
          }
}