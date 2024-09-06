/* program for finding max and min value of array */

class findMaxMin
{
  public static void main(String[] args)
  {
     int[] array = {24,78,90,89,34,67,89};
     findMaxMin ob = new findMaxMin();
     ob.max(array);
     ob.min(array);
  }
  void max(int[] array)
  {
       int max = array[0];
       for(int i = 0; i<array.length; i++)
       {
           if(max<array[i])
           {
              max = array[i];
           }
       }
       System.out.println("max of the array is "+max);
  }
  void min(int[] array)
  {
       int min  = array[0];
       for(int i = 0; i<array.length; i++)
       {
           if(min>array[i])
           {
              min  = array[i];
           }
       }
       System.out.println("min of the array is "+min);
  }

}