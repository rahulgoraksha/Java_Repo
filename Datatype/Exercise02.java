import java.util.Scanner;
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Length = ");
		int a= scan.nextInt();
		
		System.out.println("Enter the width = ");
		int b= scan.nextInt();
		
		int Area = a*b;
		int Perimeter = 2 *(a+b);
		
		System.out.println("Area of Rectangle = "+Area);
		System.out.println("Perimter of Rectangle = "+Perimeter);
		scan.close();
	}

}
