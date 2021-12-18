public class BankAccount {
    final static String SAVING_ACCOUNT = "saving account";
    final static String CURRENT_ACCOUNT = "current account";
    String holderName;
    String type;
    float balance;
    boolean isActive = true;
    public void report(){
        System.out.println("name : "+holderName);
        System.out.println("type : "+ type);
        System.out.println("balance : "+balance + "$");
        System.out.println("_________________");
    }
    public boolean transferMoney(float amount, BankAccount receiver){
        if ((balance - amount) >= 0 && isActive && receiver.isActive){
            System.out.println("transfer begins");
            balance-=amount;
            receiver.balance+=amount;
            return true;
        }else return false;
    }
    public void deActivate(){
        isActive = false;
    }
    public void activate(){
        isActive = true;
    }
}
