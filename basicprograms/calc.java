import java.util.Scanner;
class calc
{
  public static void main(String []args)
  {  String yn ;
  do
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter First number:");
     int num1 = sc.nextInt();
     System.out.println("Enter the Symbol(+,-,/,*):");
     String sym = sc.next();
     System.out.println("Enter second number:");
     int num2 = sc.nextInt();
     int res ;
     switch(sym)
     {
      case "+":res = num1 + num2;
               System.out.println("Sum is "+res);
               break;
      case "-":res = num1 - num2;
               System.out.println("Subtraction is "+res);
                break;
      case "*":res = num1 * num2;
               System.out.println("multiplication is "+res);
                break;
      case "/":res = num1 / num2;
               System.out.println("dividation  is "+res);
                break;
      default:System.out.println("wrong symbol");
     }
     System.out.println("press Y for yes and n for no");
     yn = sc.next();
    }while((yn.equals("Y"))||(yn.equals("y")));

  }
}     
     