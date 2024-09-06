/* this program does not use sorting hence have low time complexity and also we can use this for finding second smallest no of array by using MAX at the place of MIN and by using < this sign */


class scnLargestAnotherWay
{
      public static void main(String[] args)
      {
          int[] array = {12,67,90,23,40,2,34,78,9,31};
          int largest = Integer.MIN_VALUE;
          int secondlargest = Integer.MIN_VALUE;
          for(int i = 0 ; i<array.length; i++)
          {
                 if(array[i]>largest)
                 {
                    secondlargest = largest;
                    largest = array[i];
                     
                 } 
                 else if(array[i]>secondlargest && array[i] != largest)
                 {
                     secondlargest = array[i];
                 }
                 
          } 
          System.out.println("your second largest array element is :"+secondlargest);
      }
}