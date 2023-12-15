
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		double c;
		double f;
		
		input = javax.swing.JOptionPane.showInputDialog("Enter the Temperature");
		
		c = Double.parseDouble(input);
		
		f = 1.8*c+32;
		javax.swing.JOptionPane.showMessageDialog(null, "Temp in Fahrenheit "+f);
	}

}
