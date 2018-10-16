
//Michael Schulz
//PR1 16.10.2018
import java.util.*;
public class Uebung_1 {
	

	
	public static void main(String[] args) {
		
		//Scanner
		Scanner objScanner;
		objScanner = new Scanner(System.in);
		
		//Declaration of the variables
		double dbl_euro;
		double dbl_dollar;
		int int_decision;
		boolean bol_yesno = true;
		String str_input;
		
		do
		{
		//Input Dollar-Euro / Euro-Dollar
		System.out.println("Euro -> Dollar : 1 ; Dollar -> Euro : 2");
		int_decision = objScanner.nextInt();
		
		
		if(int_decision == 1)
		{
		//Input
		System.out.println("How much Euros you want to change to Dollars?");
		dbl_euro = objScanner.nextDouble();
		
		//Euro to Dollars
		dbl_dollar = (dbl_euro/134)*100;
		
		//Output
		System.out.println("Dollar: " +dbl_dollar);
		}
		else if(int_decision>2)
		{
		System.out.println("Wrong Input!");
		break;
		}
		else
		{
		System.out.println("How much Dollars you want to change to Euros?");
		dbl_dollar = objScanner.nextDouble();
			
		//Dollars to Euro
		dbl_euro = dbl_dollar*1.34;
		System.out.println("Euro: " +dbl_euro);
		}
		System.out.println("Do you need another conversion? : j/n");
		str_input = objScanner.next();
		
		
		if(str_input.equals("n"))
		{
			bol_yesno = false;
		}

		}
        while (bol_yesno);	
		
		System.out.print("Exit");
	}

}
