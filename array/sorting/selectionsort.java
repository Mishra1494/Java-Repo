import java.util.Scanner;
class selectionsort
{
             public static void main(String []args)
             {
                 Scanner sc = new Scanner(System.in); 
                 System.out.println("Enter your 1d array size");
                 int size = sc.nextInt();
                 int[] array = new int[size];
                 System.out.println("Enter your array elements");
                 for (int  i = 0 ; i<size; i++)
                 {
                     array[i] = sc.nextInt();
                 }
                 //printing array elements
                 System.out.println("Your array elements are"); 
                 for(int  i = 0; i<size; i++)
                 {
                        if(i == 0 )
                        {
                           System.out.print("{"+array[i]+",");
                        }else
                        {
                            if(i == array.length-1)
                            {
                              System.out.print(array[i]+"}");
                            }else
                            {
                               System.out.print(array[i]+",");
                            }
                        }
                 }

                 // selection sort 

                 for(int i = 0; i<array.length; i++)
                 {     
                       int smallest  = i ;
                       for(int j = i;  j<array.length; j++)
                       {
                          if(array[j] < array[smallest])
                          {
                             smallest = j;
                          }
                       }
                      int temp  = array[smallest];
                      array[smallest] = array[i];
                      array[i] = temp;
                 }
                 //printing the  sorted array
                 System.out.println("Your sorted array is"); 
                 for(int  i = 0; i<array.length; i++)
                 {
                        if(i == 0 )
                        {
                           System.out.print("{"+array[i]+",");
                        }else
                        {
                            
                            if(i == array.length-1)
                            {
                              System.out.print(array[i]+"}");
                            }else
                            {
                               System.out.print(array[i]+",");
                            }
                        }
                 }

             }
}