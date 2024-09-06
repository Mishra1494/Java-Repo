import java.util.*;
class FindEvenOddAndThereSum
{
       public static void main(String[] args)
       {
            int[] array = {1,2,34,45,67,89,98,90,5,54,33,234,234,45};
            ArrayList<Integer> evenNum = new ArrayList<>();
            ArrayList<Integer> oddNum = new ArrayList<>();
            int evenSum = 0;
            int oddSum = 0;
            for(int i = 0; i<array.length; i++)
            {
                if(array[i]%2 == 0)
                {
                        evenNum.add(array[i]); 
                }
                else
                {
                       oddNum.add(array[i]);
                }
 
            }
            System.out.println("even numbers are :");
            for(int num : evenNum)
            {
                 System.out.print(num+" ");
                 evenSum = evenSum + num;
            }
            System.out.println();
            System.out.println("total numbers of even nums are: "+evenNum.size());

            System.out.println("even nums sum is "+evenSum);
            System.out.println("odd numbers are :");
            for(int num : oddNum)
            {
                 System.out.print(num+" ");
                 oddSum  = oddSum+num;
            }
            System.out.println();
            System.out.println("total numbers of odd nums are: "+oddNum.size());
            System.out.println("odd nums sum is "+oddSum);
       }
}