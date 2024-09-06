import java.util.Scanner;
class quicksort //Quick sort => developed by tony hoar
{
    public static void main(String []args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int size = sc.nextInt();
          int[]array = new int[size];
          System.out.println("Enter your array element ");
          for(int i = 0; i<size; i++)
          {
             array[i] = sc.nextInt();
          }
          System.out.println(" array elements are");
          printArray(array);
          recursion(array,0,array.length-1);
          System.out.println("sorted array is");
          printArray(array);
 
    }
    public static int sort(int []array,int low,int high)
    {          
               int pivote  = array[low + (high-low)/2];
               while(low<high)
               {
                    while(array[low]<=pivote)
                    {
                         low++;
                    }
                    while(array[high]>=pivote)
                    {
                         high--;
                    }
                    while(low<=high)
                    {
                          int temp = array[low];
                          array[low] = array[high];
                          array[high] = temp;
                          low++;
                          high--;

                    }
                   
               }
               return low;
               
    }
    public static void recursion(int []array,int low,int high)
    {
              int mid = sort(array,low,high);
              if(low<mid-1)
              {
                   recursion(array,low,mid-1);
              }
              if(mid-1 < high)
              {
                   recursion(array,mid-1,high);
              }
    }
    public static void printArray(int[]array)
    {
             System.out.print("{ ");
             for(int i = 0; i<array.length; i++)
             {
                  System.out.print(array[i]+" ");
             }
             System.out.println("}");
    }
    
}