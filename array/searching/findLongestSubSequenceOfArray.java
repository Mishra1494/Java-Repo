import java.util.HashSet;
class findLongestSubSequenceOfArray
{
 public static void main(String[] args)
 {
       int[] a = {1,2,6,7,8,9,13,67,10,3};//take the given array
       
       HashSet<Integer> hs = new HashSet<>();
       
       // put all value of array io hash set
       for(int i = 0; i<a.length; i++)
       { 
          hs.add(a[i]);

       }

       //let's find longest subsequence
       int longest_len = 0; //we initialize a variable for finding the subsequnce of longest length
 
       for(int  i= 0;i<a.length; i++)
       {   
          if(!(hs.contains(a[i]-1)))
          {
             int no = a[i];
             while(hs.contains(no))
             {
                 no++;//this will return longest integer of subsequence present in array
             }
             if(longest_len < no-a[i])
             {
                  longest_len = no - a[i];
             }
            
          }

       }
       System.out.print("length of longest subsquence of array : "+longest_len);
 }
}