public class CheckingBankAccount
{
  private double balance;
  
  public CheckingBankAccount(double balance)
  {
    this.balance = balance;
  }
  
  public void deposit(double ammount)
  {
    balance += ammount;
  }

  public void withdraw(double ammount)
  {
    balance -= ammount;
  }
}
