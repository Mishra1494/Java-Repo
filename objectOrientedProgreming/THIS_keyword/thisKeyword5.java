//this keyword can be used to return the current class instance from method

class thisKeyword5
{
    
    thisKeyword5 show()//return type of the method is thisKeyword5 class 
    {
      return this;
    }
    public static void main(String[] args)
    {
       thisKeyword5 obj = new thisKeyword5();
       obj.show();
    }
}