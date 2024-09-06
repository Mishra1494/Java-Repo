import java.util.Scanner;
class insersationsort
{
       public static void main(String args[])
       {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter your array size:");
             int size = sc.nextInt();
             int[] array = new int[size];//creation of array
             System.out.println("Enter your array elements");
             for (int i = 0; i<size; i++)
             {
                   array[i] = sc.nextInt();
             }
             //printing array
             System.out.print("{ ");
             for(int i = 0; i<size; i++)
             {
                    System.out.print(array[i]+" ");

             } 
             System.out.println("}");
             
             // insertion sort program
             for(int i = 0; i<size; i++)
             {
                 int temp = array[i];
                 int  j = i;
                 while(j>0 && array[j-1]>temp)
                 {
                      array[j] = array[j-1];
                      j--;
                 }
                 array[j] = temp;
           
             }
             
             //printing sorted array
             System.out.print("{ ");
             for(int i = 0; i<size; i++)
             {
                    System.out.print(array[i]+" ");

             } 
             System.out.print("}");

             
       }
}