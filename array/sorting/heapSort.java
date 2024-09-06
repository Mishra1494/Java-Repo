import java.util.Scanner;
class heapSort
{
    public static void main(String []args)
    {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of your array;");
           int size = sc.nextInt();
           int[] array = new int[size];
           System.out.println("Enter your array elements");
           for(int i = 0; i<size; i++)
           {
                array[i] = sc.nextInt();
           }
           System.out.println("your array element are");
           System.out.print("{ ");
           for(int i = 0; i<size; i++)
           {
              System.out.print(array[i]+" ");
           }
           System.out.println("}");
           heapSort ob = new heapSort();
           ob.sort(array);
           ob.printArray(array);
           

    }
    public void sort(int[] array)
    {
         int leng = array.length;
         for (int i = (leng/2)-1; i>=0; i--)
         {
                heapify(array,leng,i);
         }
 
         //swap the element and heapify again
         for(int i  = leng-1; i>=0; i--)
         {
                 int temp = array[0];
                 array[0] = array[i];
                 array[i] = temp;
                 heapify(array,i,0);
         }
           
    }
    void heapify(int[] array,int k,int l)
    {
         int largest = l;//parent node index
         int li = l*2+1;//index position of left child node
         int ri = l*2+2;//index position of right child node
         if(li > k && array[li]>array[largest])
         {
                   largest = li;
         }
         if(ri> k && array[ri]>array[largest])
         {
                   largest = ri;
         }
         if(largest!=l)
         {
                   int temp = array[l];
                   array[l] = array[largest];
                   array[largest] = array[l];
                   heapify(array,k,largest);

         }

    }
    void printArray(int[] array)
    {   
         System.out.print("{ ");
           for(int i = 0; i<array.length;i++)
           {
              System.out.print(array[i]+" ");
           }

         
    }
}   


// wrog heap sort program