
import java.util.HashSet;
class findCommonOfTwoArray1
{
        public static void main(String[] args)
        {   
            HashSet<Integer> hs = new HashSet<>();

            int[] array1 = {1,2,3,56,78,90,34,42,21,23,21};
            int[] array2  = {1,87,67,76,54,45,43,42,21};
            int temp = 0;
            for(int i = 0; i<array1.length; i++)
            {
                for(int j = 0; j<array2.length; j++)
                {
                     if(array1[i] == array2[j])
                     {
                          hs.add(array1[i]);//to avoid print duplication of common element
                          temp = 1;
                          break;//to avoid wastage of time
                     }
                }
            }
            for(int no : hs)
            {
                   System.out.print(no+" ");
            }
            if(temp == 0)
            {
                   System.out.println("no common element is present ");
            }
        }
}