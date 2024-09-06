class thisKeyword1

//to invoke current class methods
{
    void display()
    {
       System.out.println("heloo Ronda Sabash Mere Bhai ");
    }
    void show()
    {
       this.display();//if we don't use this keyword here then copiler will automatically add here 
    }
    public static void main(String[] args)
    {
       thisKeyword1 obj = new thisKeyword1();
       obj.show(); 
    }
}