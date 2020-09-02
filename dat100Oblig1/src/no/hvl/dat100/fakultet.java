package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class fakultet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nummerInn = 0;
		int factorial = 1;
		while(nummerInn < 1){
			nummerInn = Integer.parseInt(showInputDialog("Gi et tall:"));
		}
		int nummerInnStart = nummerInn;
		while(nummerInn > 0){
			factorial *= nummerInn;
			nummerInn --;
		}
		
		String tekstUt = "Verdien til "+nummerInnStart+"! er: " + factorial;
		
		showMessageDialog(null, tekstUt);
		
	}

}
