class strprymd5
{
              public static void main(String []args)
              {
                  for(int i = 5; i>0; i--)
                  {    
                        
                       for(int j = 5; j>i; j--)
                       {
                                 System.out.print(" ");
                       }
                       for(int j = 1 ; j<(i*2); j++)
                       {
                                System.out.print("*");
                       } 
                                            
                       System.out.println();
                  }
              }
}