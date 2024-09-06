import java.util.*;
class PrintElementApearsOnlyOneTime
{
      public static void main(String[] args)
      {
           int[] array = {12,1,14,67,89,90,12,1,15,67,89,90};
           HashSet<Integer> hs = new HashSet<>();
           int temp = 0;
           for(int  i = array.length-1; i>=0; i--)
           {
               if(hs.contains(array[i]) == false)
               {
                      hs.add(array[i]);
                      temp = i;   
               }
               
           }
           System.out.println(array[temp] + " which appear once in the array");
      }
}