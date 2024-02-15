import java.util.*;
class bankAccount
{
    private double Balance=10000.00;
    double withdraw(int wAmount)
    {
        double WA=wAmount;// WA=Withdraw Amount
        if(WA<=0 || WA>Balance)
        {
            if(WA<=0)
            System.out.println("Entered Invalid Amount");
            else
            System.out.println("Insufficient Balance");
        }
        else
        {
            Balance=Balance-WA;
        }
        return Balance;
    }
    double deposit(int dAmount)
    {
        Balance+=dAmount;
        return Balance;
    }
    double checkBal()
    {
        return Balance;
    }
	    void option()
	    {
	    System.out.println("                       1.Withdraw");
	    System.out.println("                       2.Deposit");
	    System.out.println("                       3.Check Balance");
	    System.out.println("                       4.Exit");
	    }
}
class atmInterface
{
	public static void main(String[] args)
	{
	    System.out.println("                  Welcome To CODSOFT ATM");
	    System.out.println("                 Please Insert Debit Card");
	    Scanner s=new Scanner(System.in);
	    int n;
	    bankAccount obj=new bankAccount();
	   do
	   {
	       obj.option();
	       System.out.print("Enter Your Option : ");
	     n=s.nextInt();
	     switch(n)
	     {
	        case 1:
	            System.out.print("Enter Amount : ");
	            int amount=s.nextInt();
	            double RB=obj.withdraw(amount);// RM= Remaining Balance
	            System.out.printf("Withdran Amount : "+"%.2f",(double)amount);
	            System.out.println();
	            System.out.printf("Available Balance : "+"%.2f",RB);
	            System.out.println();
	            break;
	        case 2:
	            System.out.print("Enter Amount : ");
	            amount =s.nextInt();
	            RB=obj.deposit(amount);
	            System.out.printf("Available Balance : "+"%.2f",RB);
	            System.out.println();
	            break;
	        case 3:
	            RB=obj.checkBal();
	            System.out.printf("Available Balance : "+"%.2f",RB);
	            System.out.println();
	            break;
	        case 4:
	            System.out.println("                 Exiting ATM. Thank You!");
	            break;
	        default :
	            System.out.println("Invalid option. Please choose a valid option.");
	            
	    }
	   }
	   while(n!=4);
	}
}