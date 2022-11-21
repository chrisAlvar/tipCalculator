import java.util.Scanner;
import java.text.DecimalFormat;

public class tipCalculator {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
	    
	    //Welcome user and take user input for total bill.
	System.out.println("*******************************************************");
	   System.out.println("             Wellcome to Tip count!\n Please enter your total amount on your bill to calculate your total plus State tax."); 
	    
	  //Store in variable called totalBill.
	  Scanner input = new Scanner(System.in);
	  double totalBill = input.nextDouble();
	    

	    
	 //Ask use for tip percentage.
	System.out.println("*******************************************************");
	    System.out.println("Please enter the percentage amount you would like to tip.");
	    
	 //Calculate Tip and store in tip variable.
	    double tip = input.nextDouble();
	    double totalBillTip = totalBill * tip / 100 + totalBill;
	    
	 //Calculate TotalBillPlusTip.
	    System.out.println("Your new total pluse tip: $" + df.format(totalBillTip));
	    
	 // Ask user for number in party and split the bill.
	System.out.println("*******************************************************");
	    System.out.println("Please enter the amount of people splitting the bill.");
	    double split = input.nextDouble();
	    double overallTotalSplit = totalBillTip / split;
	    
	//Print the total bill including the split.
	    System.out.println("Your new total pluse split: $" + df.format(overallTotalSplit));

	//Print billing information.
	System.out.println("*******************************************************");
	    System.out.println("Your original total bill - $" + df.format(totalBill));
	    System.out.println("Your new total with tax and tip - $" + df.format(totalBillTip));
	    System.out.println("Your new total pluse split amount - $" + df.format(overallTotalSplit));
	    
	  }
	
}
