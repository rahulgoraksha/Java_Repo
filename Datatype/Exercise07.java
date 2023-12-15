import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the side one = ");
		int a = scan.nextInt();
		
		System.out.println("Enter the side two = ");
		int b = scan.nextInt();
		
		double c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hypotenuse of a Right Triangle = "+c);
		scan.close();
		
	}

}
