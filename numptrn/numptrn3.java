class numptrn3
{
          public static void main(String []args)
          {      int l = 1;
                  for(int i = 0; i<5; i++)
                  {
                         for(int k = 0; k<i; k++)
                         {
                          System.out.print(" "+l);
                          l++;
                         }
                         System.out.println();
                  }
          }
}