import java.util.Scanner;
public class Atm {
public static void main(String[] args) {
	Scanner src =new Scanner(System.in);
	int amount;
	int balance=10000;
	System.out.println("welcome to atm");
	while(true)
	{
		
		System.out.println("enter 1 to check balance");
		System.out.println("enter 2 to withdraw");
		System.out.println("enter 3 to deposite");
		System.out.println("enter 4 to exit");
		System.out.println("Please enter your choice");
		int choice;
		choice= src.nextInt();
	  switch(choice)
	  {
	  case 1:
		  System.out.println("Your balance is "+ balance);
		  System.out.println("  \n");
		  break;
	  case 2:
		  System.out.println("please enter the amount to witdraw");
		  amount=src.nextInt();
		  if(amount<=balance)
		  {
			  balance=balance-amount;
			  System.out.println("amount you withdrawn is: "+ amount + " " + "and your balance is: " +balance);
			  System.out.println("  \n");
		  }
		  else {
			  System.out.println("Insufficient funds");
			  System.out.println("  \n");
	  }
		  break;
		  
	  case 3:
		  System.out.println("enter the amount to deposite");
		  amount=src.nextInt();
		  balance=balance+amount;
		  System.out.println("amount you deposited is: "+ amount + " " + "and your balance is: " +balance);
		  System.out.println("  \n");
		  break;
	  case 4:
		  System.exit(0);
		  
		  default:
			  System.out.println("please enter a valid choice/n");
	}
	src.close();
}
}
}