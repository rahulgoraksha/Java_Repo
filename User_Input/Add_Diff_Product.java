import java.util.Scanner;
public class Add_Diff_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Num1 = ");
		int n1 = obj.nextInt();
		
		System.out.println("Enter Num2 = ");
		int n2 = obj.nextInt();
		
		int r = n1 + n2;
		System.out.println("Addition = "+r);
		
	    r  = n1 - n2;
		System.out.println("Difference = "+r);
		
		r = n1 * n2;
		System.out.println("Product = "+r);
		
		obj.close();
	}

}
