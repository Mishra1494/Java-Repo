class numptrn8
{
          public static void main(String []args)
          {       
                  int k = 0;
                  for(int  i = 1; i<5; i++)
                  {   
                      if( i%2 != 0)
                       {
                           for(int l =0; l<3;l++)
                           {   
                                                      
                            System.out.print(" "+k);
                            k++;
                            }
                        }
                       else
                        { 
                            int temp =  k;
                            for(int j = k+2; j>temp-1; j--)
                            {  
                            k++;
                            System.out.print(" "+j);
                            }
                                
                              
                         }
                       
                       System.out.println();
                  }
          }
}