public interface RBIInterface {

    public String depositMoney(int money);
    public String withdrawMoney(int money,String password);
    public String checkBalance(String password);
    public Double calculateTotalInterest(int years);

}
