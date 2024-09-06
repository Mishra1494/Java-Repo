class ElementInsertioToArray//always consider what is given index position or elemental possition
{
    public static void main(String[] args)
    {
            int[] array = {21,78,90,43,45};
            int posi = 3;
            int num_to_be_insrted = 100;
            for(int  i = array.length-1; i>posi-1; i--)
            {
                array[i] = array[i-1];   
            }
            array[posi-1] = 100;//insertion of element 
            //printing the array element
            for(int i = 0; i < array.length; i++)
            {
               System.out.print(array[i]+" ");
            }
    }
}