import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String location;
    private ArrayList<SavingAccount> savingAccount;
    private ArrayList<ActiveAccount> activeAccount;

    public Bank(String bankName, String location, ArrayList<SavingAccount> savingAccount, ArrayList<ActiveAccount> activeAccount) {
        this.bankName = bankName;
        this.location = location;
        this.savingAccount = savingAccount;
        this.activeAccount = activeAccount;
    }


}
