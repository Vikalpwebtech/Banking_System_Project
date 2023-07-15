import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Which Bank you want to open Account");
        System.out.println("Print 1 to create account in Lotak Bank");
        System.out.println("Print 2 to create account in SBI Bank");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter the password and initial Balance");
        String password = sc.next();
        Integer initialBalance = sc.nextInt();
        //Generating Random Account Number
        double account = Math.abs(Math.random()*Math.pow(10,9));
        String stringversion = String.valueOf(account);
        RBIInterface bankaccount;

        if(option == 1){
            bankaccount = new LotakBank(stringversion,password,initialBalance);
        }
        else{
            bankaccount = new SBIBank(stringversion,password,initialBalance);
        }

        //Initial Amount 50000
        //Withdraw Amount 20000
        bankaccount.withdrawMoney(200000,"vikki123");
        bankaccount.withdrawMoney(20000,"vikki123");
        //Deposit Amount 25000
        bankaccount.depositMoney(25000);
        System.out.println(bankaccount.checkBalance("vikki123"));
        System.out.println(bankaccount.calculateTotalInterest(3));
    }
}