import java.util.Scanner;
public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius = ");
		int radius = scan.nextInt();
		
		
		double Volume = (4.0/3.0)*Math.PI*radius*radius*radius;
		System.out.println("Volume of Sphere = "+Volume);
		scan.close();
		
	}

}
