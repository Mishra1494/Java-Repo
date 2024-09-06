class findDupilcateWithBrueforce
{
          public static void main(String[] args)
          {
              int[] array = {1,7,34,2,78,0,32,1,6,4,7};
              int temp = 0;
              for(int  i = 0; i<array.length; i++)
              { 
                  for(int  j = i+1; j<array.length; j++)
                  {
                     if(array[i] == array[j])
                     {
                         System.out.println("duplicate is found of "+array[i]);
                         temp = 1;
                     }
                      
                  }
              }
              if(temp == 0)
              {
                 System.out.print("No duplicate is found ");   
              }
          }
}