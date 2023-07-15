public class SBIBank implements RBIInterface{

    private String accountnumber;
    private String password;
    private double balance;
    private double rateofInterest = 7.5;

    public SBIBank(String accountnumber,String password,double balance) {
        this.accountnumber = accountnumber;
        this.password = password;
        this.balance = balance;
    }

    public String depositMoney(int money) {
        if(money > 0){
            this.balance += money;
            return "Amount" + money + "got credited to your account , now available balance is" + this.balance;
        }
        else {
            return "Money entered is negative amount please enter a valid amount";
        }
    }

    public String withdrawMoney(int money, String password) {
        if (this.password.equals(password)){
            if(this.balance > money){
                this.balance -= money;
                return "Amount" + money +"got debited from your account , now available balance in your account is" + this.balance;
            }
            else {
                return "You don't have sufficient Balance";
            }
        }
        else{
            return "Please Enter a valid password";
        }
    }

    public String  checkBalance(String password) {
        if(this.password.equals(password)){
            return "Available Balance in your Account is"+ this.balance;
        }
        else{
            return "You Entered a wrong password";
        }
    }

    public Double calculateTotalInterest(int years) {
        Double SI = (balance * rateofInterest * years)/100;
        return SI;
    }
}
