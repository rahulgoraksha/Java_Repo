import java.util.Scanner;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String englishword;
		
		String piglatinword;
		
		System.out.println("Enter the word");
		englishword = scan.next();
		
		piglatinword = englishword.substring(1)+englishword.charAt(0)+"ay";
		
		System.out.println("Pig Lation Word ="+piglatinword);
		scan.close();
	}

}
