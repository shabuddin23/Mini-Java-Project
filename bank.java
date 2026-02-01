import java.util.*;
public class Bank {

	    public static void main(String Args[]){

	        double bank_balance=0, deposit_amt=0, withdraw_amt;
	        int option=0;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Welcome to magada bank");
	        do{
	        	try {
	            System.out.println("\nHome\n\n1.Current Bank Balance\n2.Deposit Amount\n3.Withdraw Amount\n4.Exit\nNote : Please select options by number : ");
	            option=sc.nextInt();
	        	}
	        	catch(Exception e) {
	        		System.out.println("Please Enter a Number");
	        		sc.next();
	        		continue;
	        	}
	            switch(option){
	                case 1: System.out.println("Your current balance is : "+bank_balance);
	                break;
	                case 2: System.out.print("Enter Amount to be deposited : ");
	                        deposit_amt=sc.nextInt();
	                        if(deposit_amt <=0) {
	                			System.out.println("Enter valid amount!!");
	                		}
	                		else {		
	                        bank_balance+=deposit_amt;
	                        System.out.println("Deposit Successful!!!");
	                        System.out.println("Your current Balance After Deposit is : "+bank_balance);
	                		}
	                break;
	                case 3: System.out.print("Enter Amount to withdraw : ");
	                        withdraw_amt=sc.nextInt();
	                        if(bank_balance<withdraw_amt){
	                            System.out.println("withdraw unsuccessful\n Insufficient Balance");
	                        }
	                        else if(withdraw_amt<=0){
	                        	System.out.println("Enter Valid Amount");
	                        }
	                        else{
	                        bank_balance-=withdraw_amt;
	                        System.out.println("Withdraw Succesful!! \nyour Current bank balance after Withdraw : "+bank_balance);
	                        }
	                break;
	                case 4:System.out.println("Thank you!!!");
	                break;
	                default:System.out.println("Please enter valid option");
	                break;
	            }
	        }while(option!=4);
	        sc.close();
	    }
	   
}
