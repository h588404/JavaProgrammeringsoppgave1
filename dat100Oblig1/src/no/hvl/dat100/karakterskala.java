package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class karakterskala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int poeng = -1;
		char karakter = 'F';
		for(int i = 1; i <= 10; i++)
		{
			while(!(poeng <= 100 && poeng >= 0)) {
				poeng = Integer.parseInt(showInputDialog("Hvor mange poeng fikk student "+ i +" på prøven?"));
			}
			if(poeng >= 90){
				karakter = 'A';
			} else if(poeng >= 80) {
				karakter = 'B';
			} else if(poeng >= 60) {
				karakter = 'C';
			} else if(poeng >= 50) {
				karakter = 'D';
			} else if(poeng >= 40) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}
			
			showMessageDialog(null, "Student " + i + " fikk karakteren: " + karakter + " på prøven");
			poeng = -1;
		}
	}

}
