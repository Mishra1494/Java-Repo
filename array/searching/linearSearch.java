import java.util.Scanner;
class linearSearch
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of your array");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("enter your array elements");
            for(int i = 0; i<size; i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.println("Enter the element you want to search");
            int element = sc.nextInt();
            int temp = 0;
            for(int i = 0 ; i<size; i++)
            {
               if(array[i] == element)
               { 
                    System.out.println(element +" is found at index "+i);
                    temp = 1;
               }
               
            }
            if(temp == 0)
               {
                   System.out.println(element+" is not found");
               }
        }
}
