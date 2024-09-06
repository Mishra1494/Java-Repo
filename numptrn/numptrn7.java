class numptrn7
{   
          public static void main(String args[])
          {     
                for (int i = 0; i<5; i++)
                {      
                       int no = i;
                       for(int j = 0; j<i+1; j++)
                       {
                       System.out.print(" "+no);
                       no = no+4-j;
                       }
                       System.out.println();
                       
                       
                }
          }
}