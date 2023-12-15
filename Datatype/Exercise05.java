import java.util.Scanner;
public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount = ");
		int P = scan.nextInt();
		
		System.out.println("Enter the Rate of Interest = ");
		int R = scan.nextInt();
		
		System.out.println("Enter the Time(in Years) = ");
		int T = scan.nextInt();
		
		double SI = (P*R*T)/100;
		System.out.println("Simple Interest = "+SI+" Rs.");
		scan.close();
		
	}

}
