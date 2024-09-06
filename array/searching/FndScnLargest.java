class FndScnLargest
{     
      int [] tempArray;
      int[] array;
      int leng;
      public static void main(String[] args)
      {
           int[] iptArray = {12,1,67,3,45,65,87,23,43};
           
      
          FndScnLargest ob = new FndScnLargest();
          ob.sort(iptArray);  //sorting completed

         //for second largest element we can print element present at array.length-2
 

         System.out.println( " Your second largest array element is"+iptArray[iptArray.length-2]);








       }

      // for sorting we have used merged sort first we sort the array
      void sort(int[] iptArray)
      {
           this.array = iptArray;
           this.tempArray = new int[array.length];
           this.leng = array.length;
           divideArray(0,leng-1);
      }
      void divideArray(int start,int end)
      {
          if(start<end)
          {
             int mid  = start+((end-start)/2);
             divideArray(start,mid);
             divideArray(mid+1,end);
             mergArray(start,mid,end);
          }
      }
      void mergArray(int start,int mid, int end)
      {
          for(int  i = start; i<=end; i++)
          {
              tempArray[i] = array[i];
          }
          int k = start;
          int  j = mid+1;
          int l= start;
          while(k<=mid && j<=end)
          {
             if(tempArray[k] <= tempArray[j])
             {
                array[l] = tempArray[k]; 
                k++; 
             }
             else
             {
                array[l] = tempArray[j];
                j++;
             }
             l++;
          }
          while(k<=mid)
          {
             array[l] = tempArray[k];
             k++;
             l++;
          }
          while(j<=end)
          {
             array[l] = tempArray[j];
             j++;
             l++;
          }

      }
}