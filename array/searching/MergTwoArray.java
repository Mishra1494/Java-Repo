class MergTwoArray
{
      public static void main(String[] args)
      {
         int[] array1 = {12,32,45,67,89,90};
         int[] array2 = {34,3,42,47};
         int MergedLen = array1.length + array2.length;
         int[] mergedArray = new int[MergedLen];
         int j = 0;
         for(int  i = 0; i<array1.length && j<array1.length ;  i++)
         {  
            
            mergedArray[i] = array1[i];
            j++;
         }
         for(int i = 0; i<array2.length && j<MergedLen; i++)
         {
            mergedArray[j] = array2[i];
            j++;
         }
         //print merged array  
         for(int i = 0 ; i<MergedLen; i++)
         {
             System.out.print(mergedArray[i] + " ");
         } 

      }
}