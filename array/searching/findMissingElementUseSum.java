/*here all elements should be present consecutively only one element should be 
     missing*/



class findMissingElementUseSum
{
       public static void main(String[] args)
       {
            int[] array = {1,2,3,4,5,6,8};
            int epectedNumOfElement = array.length + 1; 
            int total_sum = (epectedNumOfElement*(epectedNumOfElement+1))/2;
            int array_sum = 0;
            for(int i = 0; i<array.length; i++)
            {
                array_sum = array_sum + array[i];
            }
            int missing_element = total_sum - array_sum ;
            System.out.println("missing element is "+missing_element);
       }
}