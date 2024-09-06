class maxSumSubArray//algorithm is also known as kadane's algorithm
{
     public static void main(String[] args)
     {
         int[] Array = {4,-2,-3,4,-1,-2,1,5,-3};
         int max_so_far = Integer.MIN_VALUE;
         int max_end_here = 0;
         int start = 0,end = 0,s =  0;
         for(int i= 0; i<Array.length; i++)
         {
            max_end_here += Array[i];
            if(max_so_far < max_end_here)
            {
                 max_so_far = max_end_here;
                 start = s; end = i;
            } 
            if(max_end_here < 0)
            {
                 max_end_here = 0;
                 s = i+1;
            }

         }
         System.out.println("Max sum of subarray is : " +max_so_far);
        System.out.println("the sub array with starting index is "+ s+" and ending index is "+end);  
     }
}