import java.util.Scanner;

public class Customer extends Person
{
  private String customerNumber;
  private boolean mailingList;
  private Scanner scan = new Scanner(System.in);
  
  public Customer()
  {    
    String name, addr, num;
  
    System.out.print("Input the customer's name: ");
    name = scan.nextLine();
    super.setName(name);
    
    System.out.print("\nInput the customer's address: ");
    addr = scan.nextLine();
    super.setAddress(addr);
    
    System.out.println("\nInput the customer's telephone number: ");
    num = scan.nextLine();
    super.setNumber(num);
    
    listOption();
    
    System.out.println("Customer's Information: ");
    System.out.println("Name: " + super.getName() 
                       + "\nAddress: " + super.getAddress()
                       + "\nTelephone Number: " + super.getNumber());
    
    if(mailingList == true)
      System.out.println("You are on the mailing list.");
    
  }
  
  public void listOption()
  {
    String input, conversion;
    
    System.out.println("Would you like to be added to our " +
                       "waiting list?");
    input = scan.nextLine();
    conversion = input.toLowerCase();
    
    if(conversion == "yes")
      mailingList = true;
    else if(conversion == "no")
      mailingList = false;
    else
      listOption();
    
  }
  
}
