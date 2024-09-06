import java.util.*;

class findFirstDuplicateUseHashSet
{
      public static void main(String[] args)
      {
             int[] array = {1,2,90,34,67,89,78,87,90,2,3,1};
             HashSet<Integer> hs = new HashSet<>();
             int temp = -1;
             for(int  i = array.length-1; i>= 0 ; i--)
             {
                 if(hs.contains(array[i]))
                 {
                      temp = i;
                 }
                 else
                 {
                      hs.add(array[i]);
                 }
             }
             if(temp != -1)
             {
                 System.out.println("first duplicate array element is : "+array[temp]);
             }
             else
             {
                 System.out.println("no duplicate is found");
             }
      }
}