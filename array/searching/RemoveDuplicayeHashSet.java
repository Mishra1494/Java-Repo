import java.util.HashSet;
class RemoveDuplicayeHashSet
{
       public static void main(String[] args)
       {
            int[] array = {12,3,34,8,2,3,12};
            HashSet<Integer> hs = new HashSet<>();
            for(int i = 0; i<array.length; i++)
            {
                hs.add(array[i]);
            }

            for(int no : hs)
            {
                  System.out.print(no + " ");
            }
       }
}