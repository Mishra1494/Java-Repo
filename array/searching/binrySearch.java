/* binary serach is very fast technique but it requires the given array to be sorted  so we need to
the sorted array first dso we should sort the array first then we can use this technique */


import java.util.Scanner;
class binrySearch
{ 
      public static void main(String[] args)
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of your array");
           int size = sc.nextInt();
           int[] array = new int[size];
           System.out.println("enter the your array elements");
           for(int i = 0; i<size; i++)
           {
                 array[i] = sc.nextInt();
           }




/* binary search program so input should be sorted array else we can add sorting block to this program but i am just going for binary search progam here */




  
           System.out.println("enter tghe array element which you want to find");
           int element  = sc.nextInt();

           int lowerIdx = 0;
           int higherIdx = size-1;
           int mid = lowerIdx + (higherIdx-lowerIdx)/2 ;
           while(lowerIdx <= higherIdx)
           {
               
               if(array[mid] == element)
               {
                        System.out.println(element + " is found at index "+lowerIdx);
                        break;
               }
               else if(array[mid]<element)
               {
                        lowerIdx = mid+1; 
                
               } 
               else
               {
                        higherIdx = mid-1;
               }
               mid = lowerIdx + (higherIdx-lowerIdx)/2 ; 
                             
           }
           if(lowerIdx>higherIdx)
           {
               System.out.println(element+"is not found");
           }
      }
}