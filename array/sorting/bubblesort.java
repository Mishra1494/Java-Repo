import java.util.Scanner;
class bubblesort  // with time complexity O(n^2)
{  
         public static void main(String []args)
         { 
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the size of array");
             int size = sc.nextInt();
             int[] array = new int[size];
             System.out.println("Enter your array integers");
             for(int i = 0; i<array.length; i++)
             {
                  array[i] = sc.nextInt(); 
             }
             // Printing array elements 
             for (int i = 0; i<array.length; i++)
             {
                 if(i == 0)
                 {
                    System.out.print("{"+array[i]+",");
                 }else
                 {
                     System.out.print(array[i]+",");
                     if(i == array.length-1 )
                     {
                        System.out.print(array[i]+"}");   
                     }
                 }   
             }

             System.out.println();
             
             // bubble sort program 

             for(int  i = 0; i<array.length; i++)
             { 
                 int check = 0 ;
                 /* this variable will help us to check whether the array is sorted or not if
                 sorted then to stop the loop */ 
                 for (int j = 0; j<array.length-1-i; j++)
                 {
                     if(array[j]>array[j+1])
                     {
                         array[j] = array[j]+array[j+1];
                         array[j+1] = array[j]-array[j+1];
                         array[j] = array[j]-array[j+1];
                         check = 1;
                     }
                     
                 }
                 if(check == 0)
                 {
                     break;
                 }               
             }
             //printing sorted array
             for (int i = 0; i<array.length; i++)
             {
                 if(i == 0)
                 {
                    System.out.print("{"+array[i]+",");
                 }else
                 {
                     System.out.print(array[i]+",");
                     if(i == array.length-1 )
                     {
                        System.out.print(array[i]+"}");   
                     }
                 }   
             }
            
         }
}