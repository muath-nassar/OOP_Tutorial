public class Main {
    public static void main(String[] args) {

        BankAdmin admin = new BankAdmin();
        BankAccount ba1 = admin.createSavingAccount("Ali",1000);
        BankAccount ba2 = admin.createCurrentAccount("Ahmad",500);
       if (ba1.transferMoney(200,ba2)){
           ba1.report();
           ba2.report();
       }else {
           System.out.println("can't perform the transaction");
       }

       ba1.deActivate();
        if (ba1.transferMoney(200,ba2)){
            ba1.report();
            ba2.report();
        }else {
            System.out.println("can't perform the transaction");
        }
        ba1.activate();
        if (ba1.transferMoney(200,ba2)){
            ba1.report();
            ba2.report();
        }else {
            System.out.println("can't perform the transaction");
        }
    }

}
