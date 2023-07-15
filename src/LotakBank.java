public class LotakBank implements RBIInterface{

    private String accNo;
    private String passCode;
    private double balance;
    private double rateofInterest = 7;
    Integer minbalance = 500;

    public LotakBank(String accNo,String passCode,double balance){
        this.accNo = accNo;
        this.passCode = passCode;
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

    public String withdrawMoney(int money, String passCode) {
        if (this.passCode.equals(passCode)){
            if(this.balance - minbalance >= money){
                this.balance -= money;
                return "Amount" + money +"got debited from your account , now available balance in your account is" + this.balance;
            }
            else {
                return "You don't have sufficient Balance";
            }
        }
        else{
            return "Please Enter a valid passCode";
        }
    }

    public String checkBalance(String passCode) {
        if(this.passCode.equals(passCode)){
            return "Available Balance in your Account is"+ this.balance;
        }
        else{
            return "You Entered a wrong passCode";
        }
    }

    public Double calculateTotalInterest(int years) {
        Double SI = (balance * rateofInterest * years)/100;
        return SI;
    }
}
