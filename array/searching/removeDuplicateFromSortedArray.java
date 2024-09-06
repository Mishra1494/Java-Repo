class removeDuplicateFromSortedArray
{
     public static void main(String[] args)
     {
           int[] array = {1,2,2,3,4,4,5,6};
           int[] temp = new int[array.length];
           int j = 0;
           for(int i = 0 ; i<array.length-1; i++)
           {    
                if(array[i] != array[i+1])
                {
                   temp[j] = array[i]; 
                   j++;   
                }
           }
           temp[j] = array[array.length-1];
         //print temp array
         for(int  i = 0; i<temp.length; i++)
         {
              System.out.print(temp[i]+" "); 
         } 

     }
}