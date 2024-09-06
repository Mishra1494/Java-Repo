class strptrn11
{
            public static void main(String []args)
            {
                for (int i = 0; i<5; i++)
                {
                    for (int j = 5; j>i+1; j--)
                    {  
                       if(j>i+2)
                       {
                       System.out.print(" ");
                       }else{
                        System.out.print("*");
                       }
               
                    }
                    System.out.println();
                }
            }
}