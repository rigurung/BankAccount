import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
        ArrayList<ActiveAccount> activeAccounts = new ArrayList<>();


    SavingAccount saving1 = new SavingAccount("Rojina", 0, "100", false );
    SavingAccount saving2 = new SavingAccount("Sanu", 0, "222", true);

    ActiveAccount active1 = new ActiveAccount("Sanu", 0, "123");



         savingAccounts.add(saving1);
         activeAccounts.add(active1);


        Bank Chase = new Bank("Chase", "Thibodaux, LA",savingAccounts, activeAccounts);

        saving1.getCusName();
        saving1.withdraw(10000);

        saving1.deposit(2000);

       saving2.withdraw(1000);
       saving1.printSummary();

    }

}
