
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
		double dbl_exchangerate = 1.34;
		int int_decision;
		boolean bol_yesno = true;
		boolean bol_why = true;
		String str_input;
		 
		//Do-while until no further conversion is needed
		do
		{
		//Do-while until an accepted input is made
		do
		{
		//Input Dollar-Euro / Euro-Dollar
		System.out.println("Euro -> Dollar : 1 ; Dollar -> Euro : 2");
		int_decision = objScanner.nextInt();
		//Unacceptable input
		if(int_decision>2)
		{
			System.out.println("Wrong Input!");
		}
			
		}
		while(int_decision>2);
		//Chosen 1 or 2
		if(int_decision == 1)
		{
		//Input Euros to Dollars
		System.out.println("How much Euros you want to change to Dollars?");
		dbl_euro = objScanner.nextDouble();
		
		//Calculation Euros to Dollars
		dbl_dollar =  (dbl_euro*dbl_exchangerate);
		dbl_dollar = Math.round(dbl_dollar*100)/100.00;
		
		//Output Dollars
		System.out.println("Dollar: " +dbl_dollar);
		}
		else
		{
		//Input Dollars to Euros
		System.out.println("How much Dollars you want to change to Euros?");
		dbl_dollar = objScanner.nextDouble();
			
		//Calculation Dollars to Euros
		dbl_euro =  dbl_dollar/dbl_exchangerate;
		dbl_euro = Math.round(dbl_euro*100)/100.00;
		
		//Output Euros
		System.out.println("Euro: " +dbl_euro);
		}
		//Do-while until an accepted input is made
		do
		{
		//Input Conversion Yes/No
		System.out.println("Do you need another conversion? : j/n");
		str_input = objScanner.next();
		
		if(str_input.equals("J") || str_input.equals ("j"))
		{
			bol_yesno =true;
			bol_why = true;
		}
		else
		{
			if(str_input.equals("N") || str_input.equals ("n"))
			{
			    bol_yesno = false;
			    bol_why = true;
			}
			else
			{
				System.out.println("Wrong Input!");
			    bol_why = false;
			}
		}
		}
		while(bol_why == false);
		
		}
        while (bol_yesno);	
		//End
		System.out.print("End of program.");
	}

}
