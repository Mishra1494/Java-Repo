import java.util.HashSet;
class findCommonOfTwoArrayHashSetWay
{
     public static void main(String[] args)
     {
         int[] array1 = {12,12,13,15,16,17,18,1998,76,65,54,32,112};
         int[] array2 = {12,86,73,563,54,43,32,21,79,76,65,54,53,112};
         HashSet<Integer> hs = new HashSet<>();
         for(int i = 0 ; i<array1.length; i++)
         {
             hs.add(array1[i]);
         }
         for(int no : array2)
         {
            if(hs.add(no) == false)
            {
                  System.out.println("common elements are :"+no);
            }
         }
     }
}
