class thisKeyword
{
    
    int i ;
    void access(int i )
    {
       this.i = i;
    }
    void show()
    {
       System.out.println(this.i);
    }
    public static void main(String[] args)
    {
        thisKeyword obj = new  thisKeyword();
        obj.access(12);
        obj.show();
    }
   
}
 