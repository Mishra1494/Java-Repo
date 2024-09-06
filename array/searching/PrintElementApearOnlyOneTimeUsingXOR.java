class PrintElementApearOnlyOneTimeUsingXOR
{
        public static void main(String[] args)
        {
               int[] array = {1,2,3,4,1,2,3};
               int  temp = 0;
               for(int i = 0; i<array.length; i++)
               {
                    temp = temp^array[i];
               }
               System.out.println("Element which appears only one time is "+temp);
        }
}