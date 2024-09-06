import java.util.*;
// finding duplicate using set less time complexity as compared to brute force methode
class findDuplicateUsingSet
{
       public static void main(String[] args)
       {
            int[] array = {1,3,2,56,79,2,4,1,34,78};
            Set<Integer> s = new HashSet<Integer>();
            System.out.print("Your duplicate elements are :");
           
            int check = 0 ;
            for(int i = 0 ; i<array.length; i++)
            {
                if(s.add(array[i]) == false)
                {
                    System.out.print(array[i]+" ");
                    check = 1;
                }
            }
            System.out.println();
           
            if(check == 0)
            {
                 System.out.println("__________________");
                 System.out.print("no duplicate found");
            }
       }
}