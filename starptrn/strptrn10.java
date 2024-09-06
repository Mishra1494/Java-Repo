class strptrn10
{
         public static void main(String []args)
         {
             for ( int i = 0; i<5; i++)
             {
                for (int j = 0 ; j<i+1; j++)
                {
                     if( j<i)
                     {
                        System.out.print(" ");
                     }
                     else
                     {
                           System.out.print("*");
                     }
 
                }
                System.out.println();
             }
         }
}