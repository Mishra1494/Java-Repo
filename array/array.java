class array
{
           public static void main(String []args)
           {
                   //creation of 1d array 
                   int[] k = new int[4];
                   k[0] = 5;
                   k[1] =5;
                   k[2] = 5;
                   k[3] = 5;

                   // creation 2d matrix array
                   int [][] m = new int[2][1];
                   m[0][0] = 4;
                   m[1][0] = 4;

                   // creation of 2d jagged array

                   int[][] j = new int[2][];
                   j[0] = new int[1];//at 0 index there will presence of aray of length 1
                   j[1] = new int[3];//at 1 index there will presence of aray of length 3

                   //  creation of 3d aray
                   int [][][] m3 = new int[2][4][1];
                   // we can also create 3d jagged aray just like 2d jaggged array
                   for (int o = 0; o<k.length;o++)
                   {
                           System.out.print(k[o]+" ");
                   }
                   System.out.println();
                   for (int o = 0; o<m.length;o++)
                   {
                          for (int i = 0; i<m[o].length;i++)
                          {
                               System.out.print(m[o][i]+" ");
                          }
                          System.out.println();
                                              
                   }
                   //just like this we can retrive data from 2d jagged array by using for loop or                                         //for each loop two times  for 3d array we can use three time for loop or for eacgh loop
                      

                    
            }
}