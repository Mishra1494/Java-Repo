class findfirstDuplicate
{
    public static void main(String[] args)
    {
           int[] array = {12,14,67,78,67,89,90,56,12};
           System.out.println("Your first duplicate element is:");
           int temp = 0;
           for(int i = 0; i<array.length; i++)
           {   
               for(int j = i+1; j<array.length; j++)
               {
                   if(array[i] == array[j])
                   {
                           System.out.print(array[i]+" ");
                           temp = 1;
                           break;
                   }
                   
               }
               if(temp > 0)
               {
                      break;
               }
  
           }
          
           if(temp == 0)
           {
                System.out.println("no duplicate is found");
           }
    }
}