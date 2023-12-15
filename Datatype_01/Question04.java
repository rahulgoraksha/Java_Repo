import java.util.Scanner;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length, width, height, numberofdoor, numberofwindows;
		
		System.out.println("Enter length");
		length = scan.nextInt();
		
		System.out.println("Enter width");
		width = scan.nextInt();
		
		System.out.println("Enter height");
		height = scan.nextInt();
		
		System.out.println("Enter number of doors");
		numberofdoor = scan.nextInt();
		
		System.out.println("Enter number of number of windows");
		numberofwindows = scan.nextInt();
		
		int totalsurfacearea = 2*(length *width + length * height + width *height);
		
		int areoffloor = length * width;
		
		int areaofwindow = 15 * numberofwindows;
		
		int areaofdoor = 20 * numberofdoor;
		
		int totalpaintarea = totalsurfacearea - areoffloor - areaofwindow - areaofdoor;
		
		int requiredpaint = totalpaintarea/350;
		
		System.out.println("Paint required "+ requiredpaint + " gallons. ");
		
		scan.close();
		
		
		
	}

}
