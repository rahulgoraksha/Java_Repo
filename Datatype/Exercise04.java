import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Base = ");
		int a = scan.nextInt();
		
		System.out.println("Enter the Height = ");
		int b = scan.nextInt();
		
		double Area = (1.0/2.0)*a*b;
		System.out.println("Area of Triangle = "+Area);
		scan.close();
		
	}

}
