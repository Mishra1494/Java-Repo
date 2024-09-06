import java.util.Scanner;
class stringSelectionSort
{
     public static void main(String[] args)
     {
           Scanner sc = new Scanner(System.in);
           int size = sc.nextInt();
           String[] array = new String[size];
           for(int i = 0; i<size; i++)
           {
               array[i] = sc.nextLine();
           }
 
           
           for(int i = 0; i<size; i++)
           {
                int sml = i;

                for(int j = i ; j<size; j++)
                {
                     if(array[j].compareTo(array[sml])<0)
                     {
                          sml = j;
                     }
                } 
                String temp = array[i];
                array[i] = array[sml];
                array[sml] = temp;
           }
           for(int i = 0; i<size; i++)
           {
               System.out.print(array[i]+" ");
           }
     }
}