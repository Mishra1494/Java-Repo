class Engine
{
   String power = "10kw";

   //HAS-A relation between the engine and power as engine has a power
}

class  Car 
{
     
     String music player;	
     public static void main(String[] args)
     {
        Engine e = new Engine();
         //Car HAS-A Engine
        System.out.println(e.power);
     }
}
