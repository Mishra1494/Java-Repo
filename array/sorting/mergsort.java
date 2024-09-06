import java.util.Scanner;
class mergsort
{       
        int[] array;
        int[] tempMArray;
        int length;
        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of your array");
            int size = sc.nextInt();
            int[] inputarray = new int[size];
            System.out.println("Enter your array elementd");
            for(int i = 0; i<size; i++)
            {
               inputarray[i] = sc.nextInt();
            }

            //printing unsorted array
            System.out.print("{ ");
            for(int i = 0; i<size; i++)
            {
              System.out.print(inputarray[i]+" ");
            }
            System.out.println("}");

            mergsort ms = new mergsort();//creation of object for calling thee fuc
            ms.sort(inputarray);


            //printing sorted array
            System.out.print("{ ");
            for(int i = 0; i<size; i++)
            {
              System.out.print(inputarray[i]+" ");
            }
            System.out.println("}");

                  
                
        }



        //values are put ionside the instanse varibles 
        public void sort(int []inputarray)
        {
            this.array = inputarray;
            this.length = array.length;
            this.tempMArray = new int[length];
            divideArray(0,length-1);
        }





        // dividation of array using double recursion technique
        public void divideArray(int start,int end)
        {
            
            if(start<end)
            {
                int mid = start + (end-start)/2;
                divideArray(start,mid);
                divideArray(mid+1,end);
                mergArray(start , mid , end);
            }
        }





        //merging array
        public void mergArray(int start , int mid , int end)
        {
            for(int i = start; i<=end; i++)
            {
                tempMArray[i] = array[i];//puting vlues in temp array 
            }
            int i = start;
            int j = mid+1;
            int k = start;

 
            //taking two divide array and comparing them and merging them
            while( i<=mid && j<=end)
            {
              if(tempMArray[i]<=tempMArray[j])
              {
                    array[k] = tempMArray[i];
                    i++;
              }
              else
              {
                   array[k] = tempMArray[j];
                   j++;
              }
              k++;
            }
            while(i<=mid)
            {
                 array[k] = tempMArray[i];
                 i++;
                 k++;
            }
            while(j<=end)
            {
                 array[k] = tempMArray[j];
                 j++;
                 k++;
            }

                        

        }
        
}

//merge sort have time complexity of Q(nlogn)