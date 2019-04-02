import java.util.Scanner;

public class SavingAccount {
    private String cusName;
    private double balance;
    private String passCode;
    private boolean fixedAccount;
    private String activities = "Activities";
    public Scanner scanner = new Scanner(System.in);


    //constructor: create a new saving account
    public SavingAccount(String cusName, double balance, String passCode, boolean fixedAccount) {
        this.cusName = cusName;
        this.balance = balance;
        this.passCode = passCode;
        this.fixedAccount = fixedAccount;
    }



    //getting back the name, balance, if the account is fixed
    public String getCusName() {
        return cusName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getFixedAccount(){
        return fixedAccount;
    }




    //Interest
    public void interestDue(int days){
        if(days < 30){
             double totalInterest = days*addInterest();
                  System.out.println("You interest to-date is $" + totalInterest + "." );
                          activities +="\n" + "Interest added: $" + totalInterest;}
        else{
            System.out.println("You interest cycle is 20 days. \n Your interest gets added in 30th of every month and \n your interest due will be 0.");
                 }

    }


//this method is called in the interestDue
    private double addInterest(){
        if(fixedAccount){
            double interest = (0.003 * balance) /30;
            return interest;

        }else{
            double interest = (0.001 * balance)/30;
            return interest;
        }
    }



    public void deposit(double amount){
        System.out.println("Enter your passcode: ");
        String passcode = scanner.nextLine();

            if (passcode.equals(this.passCode)) {
                this.balance += amount;
                System.out.println(this.cusName + "\n" + "Amount deposited: $" + amount + "\n" + "Total Balance: " + this.balance);
                activities += "\n" + "deposit: $" + amount;
            }
            else {
                System.out.println("Please enter your passcode again.");
            }
    }



    public void withdraw(double amount){
        System.out.println("Enter your passcode: ");
        String passcode = scanner.nextLine();

            if(passcode.equals(this.passCode)) {


                if (fixedAccount) {
                    System.out.println("Dear Customer, " + "\n" + "You can withdraw only after the account's Expiration Date.");
                         activities += "\n" + "withdraw attempt of $" + amount + " : unsuccessful";
                } else {
                    if(balance - amount < 0){
                        System.out.println("Your account doesn't have enough amount.");
                    }else {
                        this.balance -= balance;
                        System.out.println(this.cusName + "\n" + "Amount deposited: " + amount + "\n" + "Total Balance: " + this.balance);
                        activities += "\n" + "withdraw : $" + amount;
                    }
                }
            }

            else {
                System.out.println("Please enter your passcode again.");
            }
    }





    public void printSummary(){
        System.out.println("Name : " + this.cusName);

            if(fixedAccount) {
                System.out.println("Status : Fixed Account");
                 }else {
                      System.out.println("Status : Not Fixed Account");
                        }
                         System.out.println("Balance :"  +this.balance);
                              System.out.println( "\n" + activities);

    }


}
