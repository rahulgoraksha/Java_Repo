import java.util.Scanner;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sec;
		
		System.out.println("Enter Seconds : ");
		sec = scan.nextInt();
		
		int hr = sec/3600;
		
		sec = sec % 3600;
		int min = sec / 60;
		
		sec = sec % 60;
		
		System.out.println(hr +" hours "+min+" minutes "+sec+" seconds");
		
		
		scan.close();
		
	}

}
