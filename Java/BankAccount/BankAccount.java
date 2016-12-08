public class BankAccount
{
  private double balance;
  private int numberOfDeposits = 0;
  private int numberOfWithdrawals = 0;
  private double interestRate = .10;
  private double serviceCharge;
  
  public BankAccount(double balance, double interestRate)
  {
    this.balance = balance;
    this.interestRate = interestRate;
  }
  
  public void deposit(double amount)
  {
    balance += amount;
    numberOfDeposits++;
  }
  
  public int getNumOfDeposits()
  {
    return numberOfDeposits;
  }
  
  public void withdraw(double amount)
  {
    balance -= amount;
    numberOfWithdrawals++;
  }
  
  public int getNumOfWithdrawals()
  {
    return numberOfWithdrawals;
  }
  
  public void calcInterest()
  {
    double monthlyInterest, monthlyInterestRate;
    
    monthlyInterestRate = interestRate / 12;
    monthlyInterest = balance * monthlyInterestRate;
    balance += monthlyInterest;
  }
  
  public void monthlyProcess()
  {
    balance -= serviceCharge;
    calcInterest();
    numberOfDeposits = 0;
    numberOfWithdrawals = 0;
    serviceCharge = 0;
  }
  
  public void setCharge(double serviceCharge)
  {
    this.serviceCharge = serviceCharge;
  }
  
  public double getCharge()
  {
    return serviceCharge;
  }
  
  public double getBalance()
  {
    return balance;
  }
  
}
