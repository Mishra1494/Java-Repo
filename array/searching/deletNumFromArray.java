class deletNumFromArray
{
     public static void  main(String[] args)
     {
          int[] array = {12,13,14,16,17};
          int num_to_delet = 16;
          int count = 0;
          for(int  i = 0; i<array.length; i++)
          {
            if(array[i] == num_to_delet)
            {
                    for(int j = i; j<array.length-1; j++)
                    {
                            array[j] = array[j+1];
                    }
                   count = 1;
                   break;
            }  
          }
          if(count == 0)
          {
             System.out.print("element is not found");
          }
          else
          {
             //print the array with deleted  num
             for(int i = 0; i<array.length-1; i++)
             {
                  System.out.print(array[i] +" "); 
             }
          }
          
     }
}