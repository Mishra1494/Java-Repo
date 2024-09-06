import java.util.HashSet;
class FindComonOfThreeSortedArray
{
      public static void main(String[] args)
      {
        int[] array1 ={7,12,13,14,76,89};
        int[] array2 ={12,89};
        int[] array3 = {9,12,45,67,89,90};
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(a1 < array1.length && a2 < array2.length && a3 < array3.length)
        {
            if(array1[a1]  == array2[a2] && array2[a2] == array3[a3])
            {
               hs.add(array1[a1]);
               a1++;
               a2++;
               a3++;
            }
            else if(array1[a1] < array2[a2])
           {
              a1++; 
           }
           else if(array2[a2] < array3[a3])
           {
             a2++; 
           }
           else 
            {
             a3++;
            }
        }
        for(int no : hs)
        {
             System.out.println("common element are :"+no);
        }
      }
}