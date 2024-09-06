class AnonymusArray
{
               public static void main(String []args)
               {
                   sum(new int[]{1,2,3,4,5,6,7,8,9});     
               }
             
               static void sum(int[] k)
               {  
                  int j =  0;


                  for (int i =0; i<k.length; i++ )
                  {
                        j = j+k[i];
                  }
                  System.out.print(j);
               }
}