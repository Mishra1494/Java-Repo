import java.util.*;
class findDuplicateElementUsingMap
{
         public static void main(String []args)
         {
             int[] array = {12,12,13,14,5,14,65,76,43,445,345,445,64};
             Map<Integer,Integer> hm = new HashMap<>();
             for(int no:array)
             {
                  Integer count =   hm.get(no);//this method will reurn null integer if no. is not
                                               //present in the hm i.e. in map                                                                   
                  if(count == null)
                  {
                      hm.put(no,1); // put the no as key in hm and 1 as its value if no. is not 
                                    //present in the hm         
                  }
                  else
                  {
                           count = count+1;
                           hm.put(no,count);
                  }
             }
             // we will use entry interface for the purpose of getting key and vlue pair
            
             Set<Map.Entry<Integer,Integer>> es  =  hm.entrySet();


             //here Entry is sub interface of Map interface and th entrySet id method
             // es will return value of key



             System.out.print("Duplicate elements are:");
             for(Map.Entry<Integer,Integer> me:es)
             {
                   if(me.getValue() > 1)
                   {
                         System.out.print(me.getKey()+" ");
                   }
             }

         }
}