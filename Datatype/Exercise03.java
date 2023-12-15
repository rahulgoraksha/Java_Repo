import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Temperature = ");
		int a = scan.nextInt();
		
		double Temp_in_Celcius = (a-32)*(5.0/9.0);
		System.out.println("Temperature Conversion = "+Temp_in_Celcius);
		scan.close();
		
	}

}
