import java.util.Scanner;
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Three Number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int Average = (a+b+c)/3;
		System.out.println("Average of Three Numbers = "+Average);
		scan.close();
	}

}
