package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class trinnskatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bruttoInntekt = Integer.parseInt(showInputDialog("Oppgi bruttoinntekten"));
		int belop = 0;
		double skatt = 0;
		double nettoInntekt = bruttoInntekt;
		
		int trinn1 = 164101;
		double sats1 = 0.0093;
		int trinn2 = 230951;
		double sats2 = 0.0241;
		int trinn3 = 580651;
		double sats3 = 0.1152;
		int trinn4 = 934051;
		double sats4 = 0.1452;
		
		if(bruttoInntekt >= trinn4)
		{
			belop = bruttoInntekt - (trinn4-1);
			skatt += (double)belop*sats4;
			bruttoInntekt = trinn4-1;
		}
		if(bruttoInntekt >= trinn3) 
		{
			belop = bruttoInntekt - (trinn3-1);
			skatt += (double)belop*sats3;
			bruttoInntekt = trinn3-1;
		}
		if(bruttoInntekt >= trinn2)
		{
			belop = bruttoInntekt - (trinn2-1);
			skatt += (double)belop*sats2;
			bruttoInntekt = trinn2-1;
		}
		if(bruttoInntekt >= trinn1) 
		{
			belop = bruttoInntekt - (trinn1-1);
			skatt += (double)belop*sats1;
			bruttoInntekt = trinn1-1;
		}
		
		nettoInntekt = nettoInntekt - skatt;
		
		
		String tekstUt = ("Du må betale " + skatt + " kroner i skatt \nDin nettoinntekt er " + nettoInntekt + " kroner");
		showMessageDialog(null, tekstUt);
	}

}
