import java.util.Scanner;
class stringBubbleSort
{
         public static void main(String []args)
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the size of your Array");
             int size = sc.nextInt();
             String[] array = new String[size];
             System.out.println("enter the your array elements");
             for(int  i = 0; i<size; i++)
             {
                  array[i] = sc.nextLine();
             }
             
             //buble sort 
             for(int i = 0; i<size;i++)
             {
                 int check = 0;
                 for(int j =0; j<size-1-i; j++)
                 {
                    if(array[j].compareTo(array[j+1])>0)
                    {
                       String temp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = temp;
                       check = 1;
                    }
                 }
                 if(check == 0)
                 {
                     break;
                 }
                
             }
             for (int i =0; i<size; i++)
             {
               System.out.print(array[i]+" ");
             }

         }
}