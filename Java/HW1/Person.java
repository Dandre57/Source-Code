public class Person
{
  private String firstName;
  private String lastName;
  private Address add = null;
  private CheckingBankAccount cba = null;
  
  public Person(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public void setFirst(String firstName)
  {
    this.firstName = firstName;
  }
  
  public String getFirst()
  {
    return firstName;
  }
  
  public void setLast(String lastName)
  {
    this.lastName = lastName;
  }
  
  public String getLast()
  {
    return lastName;
  }
}
