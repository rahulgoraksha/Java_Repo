import java.util.Scanner;

class Calculator{
    public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      
      int a = scan.nextInt();
      int b = scan.nextInt();
        
      int operator = scan.nextInt();

      switch (operator) {
        case 1:System.out.println(a+b);
            
            break;
        case 2:System.out.println(a-b);
            
            break;
        case 3:System.out.println(a*b);
            
            break;
        case 4:System.out.println(a/b);
            
            break;
        case 5:System.out.println(a/b);
            
            break;
        default:System.out.println("Invalid input");
            break;
      }
    }
}
