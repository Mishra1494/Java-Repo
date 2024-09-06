


class findKthLargest
{
    int[] array = {12,14,13,10,6,5,89,24,65};//we can also take array as input here
    int  k = 5; //we can also take k aas input here
    for(int i = 0; i<array.length-1; i++)
    {
           for(int j = i+1; j<array.length; j++)
           {
              if(array[i]>array[j])
              {
                  int temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
              }
              
           }
           if(i==k-1)
           {
              break;  
           }
 
    }
    System.out.println("your "+k+"th position element is "+array[k-1]);
}

/* this program will used to find kth largest element we can also use for fiding kth smallest no.
 we will use here insertion sort && we can also use this for finding 2nd largest*/