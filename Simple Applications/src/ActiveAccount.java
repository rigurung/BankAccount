import java.util.Scanner;

public class ActiveAccount {
    private String cusName;
    private double balance;
    private String passCode;
    private String activities = "Activities";
    public Scanner scanner = new Scanner(System.in);


    public ActiveAccount( String cusName, double balance, String passCode) {
        this.cusName = cusName;
        this.balance = balance;
        this.passCode = passCode;
    }


    public String getCusName() {
        return cusName;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassCode() {
        return passCode;
    }



    public void deposit(double amount){
        System.out.println("Enter your passcode: ");
        String passcode = scanner.nextLine();

        if(passcode.equals(this.passCode)){
            this.balance+=amount;
            activities += "\n Amount deposited: " + amount;
        }
        else {
            System.out.println("Your passcode was wrong.");
        }
    }

    public void withdraw(double amount) {
        System.out.println("Enter your passcode: ");
        String passcode = scanner.nextLine();

        if (passcode.equals(this.passCode)) {
            this.balance -= amount;
            activities += "\n Amount Withdrawn: " + amount;}
            else{
                System.out.println("Your passcode was wrong.");
            }
    }

    private void printSummary(){
        System.out.println("Name : " + this.cusName);
        System.out.println("Balance :"  +this.balance);
        System.out.println(activities);
    }
}
