import java.util.Scanner;
public class Input_Addition_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		
		System.out.println("Enter Number 1 = ");
		int n1 = obj.nextInt();
		
		System.out.println("Enter Number 2 = ");
		int n2 = obj.nextInt();
		
		int r = n1 + n2;
		System.out.println("Sum = "+r);
		
		obj.close();
	}

}
