public class BankAdmin {
    public BankAccount createSavingAccount(String name , float amount){
        BankAccount account = new BankAccount();
        account.holderName = name;
        account.balance = amount;
        account.type = BankAccount.SAVING_ACCOUNT;
        return account;
    }
    public BankAccount createCurrentAccount(String name , float amount){
        BankAccount account = new BankAccount();
        account.holderName = name;
        account.balance = amount;
        account.type = BankAccount.CURRENT_ACCOUNT;
        return account;
    }
}
