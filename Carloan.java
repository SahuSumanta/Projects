//A Simple Car Loan Payment Calculator

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;//year
    int intrestRate = 5;//intrest rate
    int downPayment = 2000;//down payment

    if(loanLength <= 0 || intrestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
          int remainingBalance = carLoan - downPayment;
          int months = loanLength * 12;
          int monthlyBalance = remainingBalance/months;
          int intrest = (monthlyBalance + intrestRate) / 100;
          int monthlyPayment = monthlyBalance + intrest;
          System.out.println(monthlyPayment);
    }

	}
}