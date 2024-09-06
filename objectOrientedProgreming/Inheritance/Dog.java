class Animal
{
     void eat()
     {
             System.out.print("I am eating ");
     }
}
class Dog extends Animal
{
   public static void main(String[] args)
   {
         Dog Rosh = new Dog();
         Rosh.eat();
   }
}