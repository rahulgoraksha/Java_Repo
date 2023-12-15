import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius = ");
		int radius = scan.nextInt();
		
		double circumference = 2*Math.PI*radius;
		double Area = Math.PI*radius*radius;
		
		System.out.println("Circumference of Circle = "+circumference);
		System.out.println("Area of Circle = "+Area);
		scan.close();
		
	}

}
