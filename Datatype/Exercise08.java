import java.util.Scanner;
public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int a = scan.nextInt();
		
		int square = a*a;
		System.out.println("Square of a Number: "+square);
		
		scan.close();
	}

}
