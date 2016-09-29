import javax.swing.*;


public class Exempel3_3 {
	
	public static void main(String[] args) {
		
	int n = 10;
	
	
	
	String txt = "";
	
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++)
			txt = txt + "+";
		    txt = txt + "\n";
		
		
	}
		
	JOptionPane.showMessageDialog(null, txt);
	}

	
	
	
}
