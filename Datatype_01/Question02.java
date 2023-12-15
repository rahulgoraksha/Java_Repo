import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Are of Traingle");
		
		System.out.println("Enter the three sides of traingle: ");
		
		System.out.println("side a = ");
		int a = scan.nextInt();
		
		System.out.println("side b = ");
		int b = scan.nextInt();
		
		System.out.println("side c = ");
		int c = scan.nextInt();
		
		double s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of Traingle = "+area);
		scan.close();
		
		}

}
